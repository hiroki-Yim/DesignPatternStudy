package DecoratorPattern;

public class Client {

	public static void main(String[] args) {
/*		원래 코드(OCP위반)
		BasicEMailContent simple = new BasicEMailContent("Hello");
		System.out.println(simple.getContent());
		ExternalEMailContent external = new ExternalEMailContent("Hello");
		System.out.println(external.getContent());
		SecureEMailContent secure = new SecureEMailContent("Hello");
		System.out.println(secure.getContent());
*/
		
/* 	Decorator 패턴적용
		Component basicCmp = new BasicEMailContent("Hello");//기본
		System.out.println(basicCmp.getContent());
		Component externalCmp = new ExternalEMailContent(new BasicEMailContent("Hello"));
		System.out.println(externalCmp.getContent());
		Component secureCmp = new SecureEMailContent(new BasicEMailContent("Hello"));
		System.out.println(secureCmp.getContent());
*/
		
		SecureEMailContent scmail = new SecureEMailContent(new ExternalEMailContent(new BasicEMailContent("")));
	    System.out.println(scmail.getContent());
		
	}
}
