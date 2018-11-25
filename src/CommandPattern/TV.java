package CommandPattern;

public class TV{
	private boolean powerOn = false;
	private boolean muteOn = false;
	
	public void power() {
		powerOn =! powerOn;
		
		if(powerOn) 
			System.out.println("Power On");
		else 
			System.out.println("Power Off");
	}
	
		public void mute() {
			if(!powerOn) //전원이 꺼져있으면 아무것도 안함
				return;
			
			muteOn =! muteOn;

			if(muteOn)
				System.out.println("Mute On");
			else 
				System.out.println("Mute Off");
	}
}