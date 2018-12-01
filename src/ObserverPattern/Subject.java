package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {		//통보 대상 추가
		observers.add(observer);
		
	}
	public void detach(Observer observer) {	//통보 대상 제거
		observers.remove(observer);
	}
	
	//통보 대상 목록, 추가된 observer에게 변경을 통보
	public void  notifyObservers() {
		for (Observer o : observers ) o.update();
	}
}
