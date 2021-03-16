package question01;

/**
自動車を管理するクラスを設計します。
車種は「一般乗用車、軽自動車、キャンピングカー、大型トラック、中型トラック、小型トラック」
の４種類があります。
それぞれの車種は共通して「名前、価格、燃費」の３つの値を持っています。
またそれぞれの車種は、以下の様な動きをします。
抽象クラスを用いて、効率的に設計をしなさい。

 *
 */
public class Main {

	public static void main(String[] args) {
		//Car c = new Car();
		Car_light cl = new Car_light(11000000);
		Car_general cr = new Car_general(1200000);
		Truck_l tl = new Truck_l(300000);
		Truck_r tr = new Truck_r(4500000);

		//		cr.run();
		cl.run();
		//		tl.run();
		//		tr.run();
	}

}
