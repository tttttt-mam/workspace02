package code04_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = { 20, 30, 40, 50, 80 };

		int sum = scores[1] + scores[2]
				+ scores[3] + scores[4] + scores[0];

		//int sum = scores[1] + scores[2]
		//		+ scores[3] + scores[4] + scores[5];

		int avg = sum / scores.length;

		System.out.println("合計点：" + sum);
		System.out.println("合計点：" + avg);

	}

}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
at code04_05.Main.main(Main.java:11)
//11行目にインデックス外の「5」がある、の意味
*/