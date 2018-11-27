package DecoratorPatternPractice;

public class NaviDecorator extends CarOptionDecorator{

	private int naviPrice;
	public NaviDecorator(CarComponent decorateCar, int naviPrice) {
		super(decorateCar);
		this.naviPrice = naviPrice;
	}
	
	public int getPrice() {
		int price = super.getPrice() + naviPrice;
		return price;
	}
	
	public String getCarInfo() {
		return super.getCarInfo() + "NaviAdded ";
	}

}
