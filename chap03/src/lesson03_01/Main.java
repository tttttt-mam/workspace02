package lesson03_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String next;
		do {
			int num = new java.util.Random().nextInt(2);
			System.out.println("0か1を入力");
			int input = new java.util.Scanner(System.in).nextInt();
			if (num == input) {
				System.out.println("あたり");
			} else {
				System.out.println("はずれ");
			}
			System.out.println("続ける？（Y/N）");
			next = new java.util.Scanner(System.in).nextLine();
			//変数nextはdoの外で宣言しないとwhileでは使えない
		} while (next.equals("y"));

	}

}
