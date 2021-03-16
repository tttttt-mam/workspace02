package java03_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		第３章の追加練習問題 (3)
		for文のトレーニング①
		for文を使って下記のようにコンソールに表示してください。
		実行例（アスタリスク記号を、縦10個、横10個並べる）
		
		*/

		String num = "*";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}