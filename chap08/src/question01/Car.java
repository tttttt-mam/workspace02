package question01;

public class Car {
	int fuel;//燃料
	int speed;//時速

	//加速するメソッド
	public int accelarate(int kiro) {
		int kasoku = kiro;
		int fullSpeed = kasoku + this.speed;
		this.speed = fullSpeed;
		System.out.println(kasoku + "km/h加速しました。");
		showMenter(fullSpeed, this.fuel);
		return fullSpeed;
	}

	//燃料を消費して何キロ走るかを計算するメソッド
	public int run(int hour) {
		int kyori = this.speed * hour;
		this.fuel -= kyori;
		System.out.println(hour + "時間走りました。走行距離：" + kyori + "km");
		showMenter(this.speed, this.fuel);
		return kyori;
	}

	//停止して時速を０にするメソッド
	public void stop() {
		this.speed = 0;
		System.out.println("停止しました。");
		showMenter(this.speed, this.fuel);
	}

	//現在の燃料と時速を表示するメソッド
	public void showMenter(int x, int y) {
		this.speed = x;
		this.fuel = y;
		System.out.println("現在の時速：" + this.speed + "km/h 残り燃料：" + this.fuel + "L");
		//System.out.println();
	}
}