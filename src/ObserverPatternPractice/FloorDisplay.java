package ObserverPatternPractice;

public class FloorDisplay implements Observer{

	private ElevatorController controller;
	
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {

		System.out.println("(내부화면): 현재 층수는 " + controller.getCurFloor());
	}
}
