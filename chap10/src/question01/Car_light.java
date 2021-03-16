package question01;

/**
■軽自動車
燃費良く走る
燃費良く停まる

 */
public class Car_light extends Car {

	public Car_light(int value) {
		super(value);
	}


	public void name() {
		setName("■軽自動車");
		System.out.println(getName());
	}


	public void run() {
		System.out.println("燃費良く走る");
		name();
	}

	public void stop() {
		System.out.println("燃費良く停まる");
		name();
	}

}
