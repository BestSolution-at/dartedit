package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisGetHoverResult {
	private HoverInformation[] hovers;

	public AnalysisGetHoverResult() {
	}

	public HoverInformation[] getHovers() {
		return this.hovers;
	}

	public void setHovers(HoverInformation[] hovers) {
		this.hovers = hovers;
	}
}
