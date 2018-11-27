package DecoratorPattern;

public class ExternalEMailContent extends Decorator{
	
	public ExternalEMailContent(Component decoratedComponent) {
		super(decoratedComponent);
	}
	
	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}
	
	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}
}
