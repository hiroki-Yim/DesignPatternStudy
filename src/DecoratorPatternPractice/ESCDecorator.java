package DecoratorPatternPractice;

public class ESCDecorator extends CarOptionDecorator{

	private int escPrice;
	public ESCDecorator(CarComponent decorateCar, int escPrice) {
		super(decorateCar);
		this.escPrice = escPrice;
	}
	
	public int getPrice() {
		int price = super.getPrice() + escPrice;
		return price;
	}
	
	public String getCarInfo() {
		return super.getCarInfo() + "ESCAdded ";
	}

}
