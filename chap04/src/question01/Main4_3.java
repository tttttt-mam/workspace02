package question01;

public class Main4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*練習4-4を改良しましょう

		②numbersの初期値は0～9のランダムで
		5つ設定しましょう
		ただし、同じ数字が入ってはいけません
		その上で２回入力を受け付けます
		両方あっているときには「全部アタリ」
		片方あっているときには「アタリ」
		と表示しましょう
		*/
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			for (int j = 0; j < i; j++) {
				while (numbers[j] == numbers[i]) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
			System.out.println(numbers[i]);
		}

		int count = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("１桁の数字を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			for (int number : numbers) {
				if (number == input) {
					count++;
				}
			}
		}

	switch (count) {
		case 1:
			System.out.println("アタリ！");
		case 2:
			System.out.println("全部アタリ！");
		}
	}

}