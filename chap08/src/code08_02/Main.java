package code08_02;

public class Main {

	public static void main(String[] args) {
		//クラスHeroからインスタンスを生成し変数hに格納
		Hero h = new Hero(); //1.勇者1を生成

		Hero h2; //1.勇者2を生成
		h2 = new Hero(); //1.勇者2を生成

		//2.フィールドhに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		//2.フィールドh2に初期値をセット
		h2.name = "アサカ";
		h.hp = 90;
		System.out.println("勇者" + h2.name + "を生み出しました！");

		//クラスMatangoからインスタンスを生成し変数hに格納
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A'; //お化けキノコAを生成

		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B'; //お化けキノコBを生成

		//3.勇者のメソッドを呼び出していく
		h.sit(5); //5秒座れ
		m1.run(); //マタンゴ逃げろ
		m2.run(); //マタンゴ逃げろ
		h.slip(); //転べ
		h.sit(25); //25秒座れ
		h.run(); //逃げろ

	}

}
