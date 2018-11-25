package CommandPattern;

public class PowerOnCommand implements Command{

	private TV thePower;
	public PowerOnCommand(TV thePower) {
		this.thePower = thePower;
	}
	public void execute() {thePower.power();}
}
