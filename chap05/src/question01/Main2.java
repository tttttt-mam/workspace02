package question01;
/*
 ②長方形の面積を計算する「chouhoukeiArea()」を定義
 同メソッドから、面積を出力しなさい
 ただし、縦横の値はメインメソッドから渡すこと
 ③三角形の面積を計算する「sankakuArea()」を定義
 また、面積を出力する「printArea()」を定義
 メインメソッドから底辺高さを渡し最後はprintArea()から出力する
 */

public class Main2 {

	public static void main(String[] args) {
		int tate = 33;
		int yoko = 20;
		chouhoukeiArea(tate,yoko);
	}

	public static void chouhoukeiArea(int x ,int y) {

		int z = x * y;
		System.out.println("縦" + x + "横" + y + "長方形の面積" + z);
	}
}
