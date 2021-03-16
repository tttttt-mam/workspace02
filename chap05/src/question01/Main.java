package question01;
/*
 ①長方形の面積を計算する「chouhoukeiArea()」を定義
 同メソッドから任意の縦・横の値を決め、面積を出力しなさい
 ②長方形の面積を計算する「chouhoukeiArea()」を定義
 同メソッドから、面積を出力しなさい
 ただし、縦横の値はメインメソッドから渡すこと
 ③三角形の面積を計算する「sankakuArea()」を定義
 また、面積を出力する「printArea()」を定義
 メインメソッドから底辺高さを渡し最後はprintArea()から出力する
 */

public class Main {

	public static void main(String[] args) {
		chouhoukeiArea();
	}

	public static void chouhoukeiArea() {
		int x = 33;
		int y = 20;
		int z = x * y;
		System.out.println("縦" + x + "横" + y + "長方形の面積" + z);
	}
}
