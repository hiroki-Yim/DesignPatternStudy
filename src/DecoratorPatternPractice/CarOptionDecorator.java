package DecoratorPatternPractice;

public class CarOptionDecorator extends CarComponent{

	private CarComponent decorateCar;
	
	public CarOptionDecorator(CarComponent decorateCar) {
		this.decorateCar = decorateCar;
	}

	public int getPrice() {
		return decorateCar.getPrice();
	}

	public String getCarInfo() {
		return decorateCar.getCarInfo();
	}
}
