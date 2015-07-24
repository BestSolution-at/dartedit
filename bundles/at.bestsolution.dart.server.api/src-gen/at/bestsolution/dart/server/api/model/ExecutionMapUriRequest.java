package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ExecutionMapUriRequest {
	private ExecutionContextId id;
	private java.lang.String file;
	private String uri;

	public ExecutionMapUriRequest() {
	}

	public ExecutionMapUriRequest(ExecutionContextId id,java.lang.String file,String uri) {
		this.id = id;
		this.file = file;
		this.uri = uri;
	}

	public ExecutionContextId getId() {
		return this.id;
	}

	public void setId(ExecutionContextId id) {
		this.id = id;
	}
	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
