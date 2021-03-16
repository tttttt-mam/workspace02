package question01;


public abstract class Car {

	private String name;
	private int value;
	private int fuel;

	//	public abstract void name();

	public abstract void run();


	public abstract void stop();

	public Car(int value) {
		if (value <= 100000) {
			throw new IllegalArgumentException("10万円以上でオネシャス！");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}
}
