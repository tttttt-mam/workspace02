package question01;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//以下のように、コンソールに出力させてください
		//ただし、ＰＧ内にSystem.out.printlnは１回しか書いてはいけません
		//表示内容
		//４月の給料日：所持金￥20000
		//５月の給料日：所持金￥25000
		//…50000ずつ増える
		int month = 4;
		int money = 20000;
		while (month <= 8) {
			System.out.println(month+"月の給料日：所持金\\"+money);
			month++;
			money+=5000;

		}
	}

}
