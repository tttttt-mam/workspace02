package code04_19;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] scores = { { 40, 50, 60, 90 }, { 80, 60, 70 } };
		//System.out.println(scores.length);//要素の数2
		//System.out.println(scores[0].length);//要素の数4

		//通常for
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) { //要素の数2
				System.out.println(scores[i][j]); //要素の数4

			}
		}
		//拡張for
		for (int S[] : scores) {
			for (int N : S) {
				System.out.println(N);

			}
		}

	}
}