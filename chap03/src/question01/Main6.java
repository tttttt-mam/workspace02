package question01;

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//パスワード登録システムを開発します
		//画面に「パスワードを登録します」と表示します
		//平仮名４文字をコンソールから入力し、パスワードとします
		//次に画面に「パスワードの確認をします」と表示します
		//再度平仮名４文字の入力をコンソールから行います
		//パスワードが一致していれば「登録しました」
		//不一致であれば「パスワードが異なります」と表示

		System.out.println("パスワードを登録します");
		String pass01 = new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードの確認をします");
		String pass02 = new java.util.Scanner(System.in).nextLine();

		if (pass01.equals(pass02)) {
			System.out.println("登録しました");
		} else {
			System.out.println("パスワードが異なります");
		}
	}

}
