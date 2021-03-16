package question01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = { 20, 30, 40, 50, 80 };
		int max = 0;
		//最大値を調べる
		for (int i = 0; i < scores.length; i++) {
			max = Math.max(max, scores[i]);
		}
		System.out.println("最大値：" + max);

		int min =  Integer.MAX_VALUE;
		//最小値を調べる
		for (int i = 0; i < scores.length; i++) {
			min = Math.min(min, scores[i]);
		}
		System.out.println("最小値：" + min);

		int l = 1;
		//すべての値を掛け算した値
		for (int i = 0; i < scores.length; i++) {
			l = scores[i] * l;
		}
		System.out.println("掛け算：" + l);

	}
}