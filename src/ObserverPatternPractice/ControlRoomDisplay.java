package ObserverPatternPractice;

public class ControlRoomDisplay implements Observer{

	private ElevatorController controller;
	
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {

		System.out.println("(중앙통제실) 현재 엘리베이터 위치는 " + controller.getCurFloor());
	}
}
