package question01;

/**
■小型トラック
普通に走る
普通に停まる
荷物をやや積む

 */
public class Truck_l extends Truck {

	public Truck_l(int value) {
		super(value);
	}

	public void name() {
		this.name = "■小型トラック";
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

	public void baggage() {
		System.out.println("荷物をやや積む");
		name();
	}
}
