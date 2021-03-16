package java02_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		第２章の追加練習問題 (３)
		以下のプログラムを作成してください。
		入力と出力は下の実行例を参照してください。

		コンソールから年齢を入力する（型は自由）。
		コンソールに今年と来年の年齢を出力する。

		*/

		System.out.println("年齢を入力してください");
		int age01 = new java.util.Scanner(System.in).nextInt();

		System.out.println("今年" + age01 + "歳");
		age01++;
		System.out.println("今年" + age01 + "歳");

	}

}
