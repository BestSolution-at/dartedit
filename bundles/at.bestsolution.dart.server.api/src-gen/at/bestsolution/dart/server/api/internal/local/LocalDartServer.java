package at.bestsolution.dart.server.api.internal.local;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import at.bestsolution.dart.server.api.DartService;

import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class LocalDartServer implements at.bestsolution.dart.server.api.DartServer {
	private final String id;
	private Process p;
	private Map<String,CompletableFuture<JsonObject>> waitingResponseConsumerMap = new HashMap<>();

	private AtomicInteger requestCount = new AtomicInteger();

	private LocalServerService serverService;
	private LocalAnalysisService analysisService;
	private LocalCompletionService completionService;
	private LocalSearchService searchService;
	private LocalEditService editService;
	private LocalExecutionService executionService;

	private String dartSDKDir = System.getProperty("dart.sdkdir","/Users/tomschindl/Downloads/dart-sdk");
	private String dartServer = System.getProperty("dart.analysis.binary","bin/snapshots/analysis_server.dart.snapshot");

	public LocalDartServer(String id) {
		this.id = id;
		try {
			p = Runtime.getRuntime().exec( dartSDKDir + "/bin/dart " + dartSDKDir + "/" + dartServer);

			Thread t = new Thread() {
				public void run() {
					try {
						BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String l = null;
						while( (l = r.readLine()) != null ) {
							dispatch(l);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.setDaemon(true);
			t.start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void dispose() {
		p.destroy();
		if( serverService != null ) {
			serverService.dispose();
		}
		if( analysisService != null ) {
			analysisService.dispose();
		}
		if( completionService != null ) {
			completionService.dispose();
		}
		if( searchService != null ) {
			searchService.dispose();
		}
		if( editService != null ) {
			editService.dispose();
		}
		if( executionService != null ) {
			executionService.dispose();
		}
	}

	public Future<JsonObject> sendRequest(String method, Object request) {
		if( p.isAlive() ) {
			String requestId = id + "_" + requestCount.incrementAndGet();
			CompletableFuture<JsonObject> f = new CompletableFuture<>();
			synchronized(waitingResponseConsumerMap) {
				waitingResponseConsumerMap.put(requestId, f);
			}

			synchronized (p) {
				String r = "{ \"id\" : \"" + requestId + "\", \"method\" : \""+method+"\" ";
				if( request != null ) {
					r += ", \"params\" :  " + new Gson().toJson(request);
				}
				r += "}";
				r = r.replace('\n', ' ');
				r = r.replace('\r', ' ');
				r += "\n";
				try {
					p.getOutputStream().write(r.getBytes());
					p.getOutputStream().flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return f;
		}
		return null;
	}

	public String getId() {
		return this.id;
	}

	private void dispatch(String input) {
		JsonParser p = new JsonParser();
		JsonObject root = (JsonObject) p.parse(input);

		if( root.has("event") ) {
			String eventTarget = root.get("event").getAsString();
			switch(eventTarget.substring(0,eventTarget.indexOf("."))) {
				case "server":
				{
					if( serverService != null ) {
						serverService.dispatchEvent(root);
					}
					break;
				}
				case "analysis":
				{
					if( analysisService != null ) {
						analysisService.dispatchEvent(root);
					}
					break;
				}
				case "completion":
				{
					if( completionService != null ) {
						completionService.dispatchEvent(root);
					}
					break;
				}
				case "search":
				{
					if( searchService != null ) {
						searchService.dispatchEvent(root);
					}
					break;
				}
				case "edit":
				{
					if( editService != null ) {
						editService.dispatchEvent(root);
					}
					break;
				}
				case "execution":
				{
					if( executionService != null ) {
						executionService.dispatchEvent(root);
					}
					break;
				}
			}
		} else if( root.has("id") ) {
			String id = root.get("id").getAsString();
			CompletableFuture<JsonObject> future;
			synchronized(waitingResponseConsumerMap) {
				future = waitingResponseConsumerMap.remove(id);
			}

			if( future != null ) {
				future.complete(root);
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public <S extends DartService> S getService(Class<S> serviceType) {
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceServer.class ) {
			if( serverService == null ) {
				serverService = new LocalServerService(this);
			}
			return (S) serverService;
		}
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceAnalysis.class ) {
			if( analysisService == null ) {
				analysisService = new LocalAnalysisService(this);
			}
			return (S) analysisService;
		}
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceCompletion.class ) {
			if( completionService == null ) {
				completionService = new LocalCompletionService(this);
			}
			return (S) completionService;
		}
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceSearch.class ) {
			if( searchService == null ) {
				searchService = new LocalSearchService(this);
			}
			return (S) searchService;
		}
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceEdit.class ) {
			if( editService == null ) {
				editService = new LocalEditService(this);
			}
			return (S) editService;
		}
		if( serviceType == at.bestsolution.dart.server.api.services.ServiceExecution.class ) {
			if( executionService == null ) {
				executionService = new LocalExecutionService(this);
			}
			return (S) executionService;
		}
		return null;
	}
}

