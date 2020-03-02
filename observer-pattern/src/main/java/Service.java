import java.util.ArrayList;
import java.util.List;

public class Service implements Observable {
	private String name;
	private List<Observer> observers;

	public Service(String name) {
		super();
		this.name = name;
	}

	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}

	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Observer> getObservers() {
		if (observers == null)
			this.observers = new ArrayList<Observer>();
		return observers;
	}

	@Override
	public String toString() {
		return name;
	}

	public void notify(String message) {
		for (Observer o : observers)
			o.notify(this, message);
	}
}
