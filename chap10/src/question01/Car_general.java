package question01;

/**
■一般乗用車
普通に走る
普通に停まる
名前、価格、燃費
 */
public class Car_general extends Car {

	public Car_general(int value) {
		super(value);
	}

	public void name() {
		this.name = "■一般乗用車";
		System.out.println(this.name);
	}

	public void run() {
		System.out.println("普通に走る");
		name();
	}

	public void stop() {
		System.out.println("普通に停まる");
		name();
	}
}
