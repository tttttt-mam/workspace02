package question01;
/*
 ③三角形の面積を計算する「sankakuArea()」を定義
 また、面積を出力する「printArea()」を定義
 メインメソッドから底辺高さを渡し最後はprintArea()から出力する
 */

public class Main3 {

	public static void main(String[] args) {
		double tate = 17;
		double yoko = 11;
		sankakuArea(tate, yoko);
	}

	public static void sankakuArea(double x, double y) {

		double menseki = x * y / 2;
		printArea(menseki, x, y);
	}

	public static void printArea(double z, double x2, double y2) {

		System.out.println("縦" + x2 + "横" + y2 + "三角形の面積" + z);
	}
}
