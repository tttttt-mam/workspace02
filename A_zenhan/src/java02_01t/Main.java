package java02_01t;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		第２章の追加練習問題 (１)
		以下のプログラムを作成してください。
		入力と出力は下の実行例を参照してください。

		コンソールから底辺と高さをdouble値で入力する。
		コンソールに三角形の面積を出力する。
		三角形の面積の公式は、底辺×高さ÷２とする。

		*/

		System.out.println("底辺");
		double teihen = new java.util.Scanner(System.in).nextDouble();
		System.out.println("高さ");
		double hight = new java.util.Scanner(System.in).nextDouble();

		System.out.println(teihen + "×" + hight + "÷２");
		double area = (teihen * hight) / 2;
		System.out.println("面積:" + area);

	}

}
