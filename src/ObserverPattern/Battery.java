package ObserverPattern;

public class Battery extends Subject {

	private int level = 100;

	public void consume(int amount) {
		level -= amount;
		notifyObservers(); // 데이터가 변경되면 호출
	}

	public int getLevel() {
		return level;
	}
}
