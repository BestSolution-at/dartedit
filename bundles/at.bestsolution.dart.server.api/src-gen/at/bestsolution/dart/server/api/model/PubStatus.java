package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class PubStatus  {
	private boolean isListingPackageDirs ;

	public PubStatus() {
	}

	public boolean getIsListingPackageDirs() {
		return this.isListingPackageDirs;
	}

	public void setIsListingPackageDirs(boolean isListingPackageDirs) {
		this.isListingPackageDirs = isListingPackageDirs;
	}

	public String toString() {
		return "PubStatus@"+hashCode()+"[isListingPackageDirs = "+isListingPackageDirs+"]";
	}
}
