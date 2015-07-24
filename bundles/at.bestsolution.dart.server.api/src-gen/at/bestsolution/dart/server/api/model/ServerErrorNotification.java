package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ServerErrorNotification {
	private boolean isFatal;
	private String message;
	private String stackTrace;

	public ServerErrorNotification() {
	}

	public boolean getIsFatal() {
		return this.isFatal;
	}

	public void setIsFatal(boolean isFatal) {
		this.isFatal = isFatal;
	}
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getStackTrace() {
		return this.stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
}
