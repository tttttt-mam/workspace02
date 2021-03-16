package code04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores;
		scores = new int[5];

		//1行で書く場合
		int[] scores2 = new int[5];
		int num = scores2.length;
		//要素の数を知る
		System.out.println("要素の数" + num);
		//配列のへの代入と取得
		scores[1] = 10;
		System.out.println(scores[1]);
		//int[]型の場合、要素が空でも0で初期化されている。errorにならない
		System.out.println(scores[0]);
	}

}
