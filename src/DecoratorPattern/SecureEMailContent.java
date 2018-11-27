package DecoratorPattern;

public class SecureEMailContent extends Decorator{

	public SecureEMailContent(Component decoratedComponent) {
		super(decoratedComponent);
	}
	
	public String getContent() {
		String content = super.getContent();
		String encryptedContent = encrypt(content);
		return encryptedContent;
	}
	
	private String encrypt(String content) {
		return content + " Encrypted";
	}

}
