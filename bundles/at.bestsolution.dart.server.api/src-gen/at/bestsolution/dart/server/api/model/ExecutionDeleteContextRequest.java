package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ExecutionDeleteContextRequest {
	private ExecutionContextId id;

	public ExecutionDeleteContextRequest() {
	}

	public ExecutionDeleteContextRequest(ExecutionContextId id) {
		this.id = id;
	}

	public ExecutionContextId getId() {
		return this.id;
	}

	public void setId(ExecutionContextId id) {
		this.id = id;
	}
}
