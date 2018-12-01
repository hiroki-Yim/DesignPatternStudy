package ObserverPatternPractice;

public class Client {

	public static void main(String[] args) {
		ElevatorController controller = new ElevatorController();
		
		ControlRoomDisplay roomdisplay = new ControlRoomDisplay(controller);
		ElevatorDisplay elevatordisplay = new ElevatorDisplay(controller);
		FloorDisplay floordisplay = new FloorDisplay(controller);
		VoiceNotice voicenotice = new VoiceNotice(controller);
		
		controller.attach(elevatordisplay);
		controller.attach(voicenotice);
		controller.attach(floordisplay);
		controller.attach(roomdisplay);
		
		controller.gotoFloor(5);
		controller.gotoFloor(10);
		
	}
}
