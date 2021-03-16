package question01;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//さいころゲームを作ります
		//さいころを二つふって、大きいほうの目が出たさいころを勝ちとします。
		//ゲーム結果として、画面に以下のように表示するPGを作りなさい
		//表示内容
		//〇と△は、〇のほうが大きいので〇の勝ち
		//※〇と△が等しい場合は（引き分け）と表示する

		int a = new java.util.Random().nextInt(6);
		int b = new java.util.Random().nextInt(6);
		a++;
		b++;
		int c = Math.max(a, b);

		if (a > b || b > a) {
			System.out.println(a + "と" + b + "は、" + c + "のほうが大きいので" + c + "の勝ち");
		} else {
			System.out.println(a + "と" + b + "は、等しいので引き分け");
		}
	}

}
