package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class RequestError  {
	private RequestErrorCode code ;
	private String message ;
	private String stackTrace ;

	public RequestError() {
	}

	public RequestErrorCode getCode() {
		return this.code;
	}

	public void setCode(RequestErrorCode code) {
		this.code = code;
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

	public String toString() {
		return "RequestError@"+hashCode()+"[code = "+code+", message = "+message+", stackTrace = "+stackTrace+"]";
	}
}
