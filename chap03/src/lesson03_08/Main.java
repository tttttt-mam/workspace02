package lesson03_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//60に等しい
		int weight = 65;
		if (weight == 60) {
			System.out.println(weight);
		}

		//合計の2倍が60を超えている
		int age1 = 10;
		int age2 = 22;
		if (2*(age1 + age2) > 60) {
			System.out.println(age1 + age2);
		}

		//奇数である
		int age = 15;
		if (age%2 == 1){
			System.out.println(age);
		}

		//中身が湊
		String name = "港";
		if (name.equals("湊")) {
			System.out.println(name);
		}
	}

}
