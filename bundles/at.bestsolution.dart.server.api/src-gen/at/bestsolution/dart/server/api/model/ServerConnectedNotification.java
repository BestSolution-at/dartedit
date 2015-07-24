package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ServerConnectedNotification {
	private String version;

	public ServerConnectedNotification() {
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
