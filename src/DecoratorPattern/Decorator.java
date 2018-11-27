package DecoratorPattern;

public class Decorator extends  Component{
	private Component decoratedComponent;
	
	public Decorator(Component decoratedComponent) {
		this.decoratedComponent = decoratedComponent;
	}
	
	public String getContent() {
		return decoratedComponent.getContent();
	}
}
