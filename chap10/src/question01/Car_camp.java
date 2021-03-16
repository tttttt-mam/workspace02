package question01;

/**
■キャンピングカー
普通に走る
普通に停まる
ここをキャンプ地とする
 */
public class Car_camp extends Car_general {

	public Car_camp(int value) {
		super(value);
	}

	public void name() {
		this.name = "■キャンピングカー";
		System.out.println(this.name);
	}

	public void camp() {
		System.out.println("ここをキャンプ地とする");
		name();
	}


}
