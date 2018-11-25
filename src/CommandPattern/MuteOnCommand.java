package CommandPattern;

public class MuteOnCommand implements Command{

	public TV theMute;
	public MuteOnCommand(TV theMute) {
		this.theMute = theMute;
	}
	public void execute() {theMute.mute();}
}
