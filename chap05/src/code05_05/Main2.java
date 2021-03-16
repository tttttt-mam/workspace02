package code05_05;

public class Main2 {

	//mainメソッド
	public static void main(String[] args) {
		//メソッド呼び出し（変数ではない）
		add("誕生日おめで",10);//誕生日おめで + 10 = 誕生日おめで10
	}

	//複数の値を受け取るaddメソッド
	public static void add(String x, int y) {
		String ans = x + y;
		//誕生日おめで + 10 = 誕生日おめで10
		System.out.println(x + " + " + y + " = " + ans);
	}
}
