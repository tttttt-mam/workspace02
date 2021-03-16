package code03_08;

public class Main3_3_5 {

	public static void main(String[] args) {
		// ループ変数を1からスタートする
		for (int i = 1; i < 10; i++) {
			System.out.println("ループ変数を1からスタートする" + (i+1));
		}

		// ループ変数を2ずつ増やす
		for (int i = 0; i < 10; i += 2) {
			System.out.println("ループ変数を2ずつ増やす" + (i+1));
		}

		// ループ変数を10から1ずつ1まで減らす
		for (int i = 10; i > 0; i--) {
			System.out.println("10から1ずつ1まで減らす" + (i+1));
		}

		// ループ変数を初期化しない
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("ループ変数を初期化しない" + (i+1));
		}

		// 繰り返し時の処理を行わない
		for (i = 0; i < 10;) {
			System.out.println("繰り返し時の処理を行わない" + (i+1));
			i++;
		}

	}

}
