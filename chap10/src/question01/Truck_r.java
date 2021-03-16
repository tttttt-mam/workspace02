package question01;

/**
■大型トラック
ゴトゴト走る
ゴトゴト停まる
荷物をめっちゃ積む

 */
public class Truck_r extends Truck {

	public Truck_r(int value) {
		super(value);
	}

	public void name() {
		this.name = "■大型トラック";
		System.out.println(this.name);
	}

	public void run() {
		System.out.println("ゴトゴト走る");
		name();
	}

	public void stop() {
		System.out.println("ゴトゴト停まる");
		name();
	}

	public void baggage() {
		System.out.println("荷物をめっちゃ積む");
		name();
	}
}
