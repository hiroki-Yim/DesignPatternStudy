package ObserverPatternPractice;

public class VoiceNotice implements Observer{
	
	private ElevatorController controller;
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {
		System.out.println("(음성) : 현재 층수는 " + controller.getCurFloor());
	}

}
