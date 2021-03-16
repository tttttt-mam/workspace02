package question01;

public class Main02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int yen = 20000;
		int wine = 3500;
		int oturi = yen-wine*(yen/wine);
		int oturi2 = yen%wine;
		System.out.println(yen/wine);
		System.out.println(oturi);
		System.out.println(oturi2);
	}

}
