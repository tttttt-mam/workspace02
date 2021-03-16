package question01;

public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*練習4-4を改良しましょう
		①numbersの初期値は0～9のランダムで
		３つ設定しましょう
		ただし、同じ数字が入ってはいけません

		*/
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = new int[3];
		System.out.println("１桁の数字を入力してください");
		numbers[0] = new java.util.Random().nextInt(10);
		numbers[1] = new java.util.Random().nextInt(10);

		while (numbers[0] == numbers[1]) {
			numbers[1] = new java.util.Random().nextInt(10);
		}
		numbers[2] = new java.util.Random().nextInt(10);

		while (numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
			numbers[2] = new java.util.Random().nextInt(10);
		}

		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (input == numbers[i]) {
				System.out.println("アタリ！");
			}
		}

	}

}