package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ExecutionCreateContextResult {
	private ExecutionContextId id;

	public ExecutionCreateContextResult() {
	}

	public ExecutionContextId getId() {
		return this.id;
	}

	public void setId(ExecutionContextId id) {
		this.id = id;
	}
}
