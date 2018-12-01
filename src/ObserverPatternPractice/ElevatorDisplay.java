package ObserverPatternPractice;

public class ElevatorDisplay implements Observer{
	private ElevatorController controller;
	
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		System.out.println("(엘리베이터 내부) 현재 층수는 " + controller.getCurFloor());
	}
}
