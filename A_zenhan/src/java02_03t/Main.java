package java02_03t;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		第２章の追加練習問題 (３)
		4桁の暗証番号を入力し、認証するシステムを作ります。
		下記実行例のように、実行すると、暗証番号の入力を求められ、
		暗証番号を入力してEnterキーを押す。
		暗証番号が1437と一致した場合は「暗証番号を認証しました。」と表示され、
		一致しないと「暗証番号が異なります。」と表示されるプログラムを作ってください。

		実行例
		暗証番号フォーム
		[4桁の暗証番号を入力して下さい]>1437

		*/

		System.out.println("暗証番号フォーム");
		int id = 1437;
		System.out.println("[4桁の暗証番号を入力して下さい]>" + id);
		int pass = new java.util.Scanner(System.in).nextInt();

		if (pass == id) {
			System.out.println("暗証番号を認証しました。");
		} else {
			System.out.println("暗証番号が異なります。");

		}

	}
}
