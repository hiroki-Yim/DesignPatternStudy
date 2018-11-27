package DecoratorPattern;

public class BasicEMailContent extends Component{
	
	private String content;
	
	public BasicEMailContent(String content) {
	      this.content = content;
	   }
	
	public String getContent() {
		return content;
	}
}
