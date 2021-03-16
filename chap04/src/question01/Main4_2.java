package question01;

public class Main4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*練習4-4を改良しましょう
		①numbersの初期値は0～9のランダムで
		３つ設定しましょう
		ただし、同じ数字が入ってはいけません

		*/
		// TODO 自動生成されたメソッド・スタブ
		
		//要素3の配列numbersを宣言
		int[] numbers = new int[3];
		
		//配列numbersにランダムに数値を代入
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			
		//配列numbersの内容が重複しているかチェック
			for (int j = 0; j < i; j++) {		//iとjが0の時は処理がない？
				while (numbers[j] == numbers[i]) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
			
			System.out.println(numbers[i]);
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