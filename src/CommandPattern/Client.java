package CommandPattern;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		TwoButtonController rc = new TwoButtonController();

		rc.setCommand(new MuteOnCommand(tv), new PowerOnCommand(tv));
		rc.button1Pressed();
		rc.button2Pressed();

		rc.button1Pressed();
		rc.button1Pressed();
		rc.button2Pressed();
		rc.button1Pressed();
	}
}
