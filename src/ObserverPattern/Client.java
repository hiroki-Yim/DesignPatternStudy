package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		Battery battery = new Battery();
		
		BatteryLevelDisplay batteryDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		
		battery.attach(batteryDisplay);	// 구독 등록, 계속 관찰하고 있을 대상 추가
		battery.attach(lowBatteryWarning);

		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
	}
}
