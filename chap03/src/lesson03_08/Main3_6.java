package lesson03_08;

public class Main3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(9);
		for (int i = 0; 0 < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("あたり！");
				break;
			} else {
				System.out.println("違います");
			}

		}
		System.out.println("ゲームを終了します");

	}

}
