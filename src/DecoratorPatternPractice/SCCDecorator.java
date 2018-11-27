package DecoratorPatternPractice;

public class SCCDecorator extends CarOptionDecorator{

	private int sccPrice;
	public SCCDecorator(CarComponent decorateCar, int sccPrice) {
		super(decorateCar);
		this.sccPrice = sccPrice;
	}
	
	public int getPrice() {
		int price = super.getPrice() + sccPrice;
		return price;
	}
	
	public String getCarInfo() {
		return super.getCarInfo() + "SCCAdded ";
	}
	
}
