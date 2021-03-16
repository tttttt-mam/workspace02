package code03_09;

public class Main3_6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("break"+i);
		}

		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("continue"+i);
		}

	}

}