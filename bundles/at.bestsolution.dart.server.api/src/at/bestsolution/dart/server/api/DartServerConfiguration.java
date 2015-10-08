package at.bestsolution.dart.server.api;

import java.util.function.BiConsumer;

public interface DartServerConfiguration {
	public String getDartSDKDirectory();
	public String getServerBinary();
	public void addConfigurationChangeConsumer(BiConsumer<String, String> consumer);
	public void removeConfigurationChangeConsumer(BiConsumer<String, String> consumer);
}
