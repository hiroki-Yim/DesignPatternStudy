package DecoratorPatternPractice;

public class Client {

	public static void main(String[] args) {
		CarComponent car = new BasicCar(100);
		car = new AirBagDecorator(car, 40);
	      System.out.println(car.getPrice());
	      System.out.println(car.getCarInfo());
	}
}
