package DecoratorPatternPractice;

public class AirBagDecorator extends CarOptionDecorator{
	
	private int airBagPrice;
	
	public AirBagDecorator(CarComponent decorateCar, int airBagPrice) {
		super(decorateCar);	
		this.airBagPrice = airBagPrice;
	}
	
	public int getPrice() {
		int price = super.getPrice() + airBagPrice;
		return price;
	}
	
	public String getCarInfo() {
		return super.getCarInfo() + "airBagAdded ";
	}

}
