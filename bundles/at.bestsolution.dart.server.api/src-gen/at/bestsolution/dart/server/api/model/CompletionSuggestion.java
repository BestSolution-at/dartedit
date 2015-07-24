package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class CompletionSuggestion  {
	private CompletionSuggestionKind kind ;
	private int relevance ;
	private String completion ;
	private int selectionOffset ;
	private int selectionLength ;
	private boolean isDeprecated ;
	private boolean isPotential ;
	private String docSummary ;
	private String docComplete ;
	private String declaringType ;
	private Element element ;
	private String returnType ;
	private String[] parameterNames ;
	private String[] parameterTypes ;
	private int requiredParameterCount ;
	private boolean hasNamedParameters ;
	private String parameterName ;
	private String parameterType ;
	private String importUri ;

	public CompletionSuggestion() {
	}

	public CompletionSuggestionKind getKind() {
		return this.kind;
	}

	public void setKind(CompletionSuggestionKind kind) {
		this.kind = kind;
	}
	public int getRelevance() {
		return this.relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	public String getCompletion() {
		return this.completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
	}
	public int getSelectionOffset() {
		return this.selectionOffset;
	}

	public void setSelectionOffset(int selectionOffset) {
		this.selectionOffset = selectionOffset;
	}
	public int getSelectionLength() {
		return this.selectionLength;
	}

	public void setSelectionLength(int selectionLength) {
		this.selectionLength = selectionLength;
	}
	public boolean getIsDeprecated() {
		return this.isDeprecated;
	}

	public void setIsDeprecated(boolean isDeprecated) {
		this.isDeprecated = isDeprecated;
	}
	public boolean getIsPotential() {
		return this.isPotential;
	}

	public void setIsPotential(boolean isPotential) {
		this.isPotential = isPotential;
	}
	public String getDocSummary() {
		return this.docSummary;
	}

	public void setDocSummary(String docSummary) {
		this.docSummary = docSummary;
	}
	public String getDocComplete() {
		return this.docComplete;
	}

	public void setDocComplete(String docComplete) {
		this.docComplete = docComplete;
	}
	public String getDeclaringType() {
		return this.declaringType;
	}

	public void setDeclaringType(String declaringType) {
		this.declaringType = declaringType;
	}
	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public String[] getParameterNames() {
		return this.parameterNames;
	}

	public void setParameterNames(String[] parameterNames) {
		this.parameterNames = parameterNames;
	}
	public String[] getParameterTypes() {
		return this.parameterTypes;
	}

	public void setParameterTypes(String[] parameterTypes) {
		this.parameterTypes = parameterTypes;
	}
	public int getRequiredParameterCount() {
		return this.requiredParameterCount;
	}

	public void setRequiredParameterCount(int requiredParameterCount) {
		this.requiredParameterCount = requiredParameterCount;
	}
	public boolean getHasNamedParameters() {
		return this.hasNamedParameters;
	}

	public void setHasNamedParameters(boolean hasNamedParameters) {
		this.hasNamedParameters = hasNamedParameters;
	}
	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public String getImportUri() {
		return this.importUri;
	}

	public void setImportUri(String importUri) {
		this.importUri = importUri;
	}

	public String toString() {
		return "CompletionSuggestion@"+hashCode()+"[kind = "+kind+", relevance = "+relevance+", completion = "+completion+", selectionOffset = "+selectionOffset+", selectionLength = "+selectionLength+", isDeprecated = "+isDeprecated+", isPotential = "+isPotential+", docSummary = "+docSummary+", docComplete = "+docComplete+", declaringType = "+declaringType+", element = "+element+", returnType = "+returnType+", parameterNames = "+parameterNames+", parameterTypes = "+parameterTypes+", requiredParameterCount = "+requiredParameterCount+", hasNamedParameters = "+hasNamedParameters+", parameterName = "+parameterName+", parameterType = "+parameterType+", importUri = "+importUri+"]";
	}
}
