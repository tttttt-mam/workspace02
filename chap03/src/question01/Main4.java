package question01;

public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//以下のように、コンソールに出力させてください
		//ただし、ＰＧ内にSystem.out.printlnは2回しか書いてはいけません
		//表示内容
		//４月の給料日：所持金￥200000
		//５月の給料日：所持金￥250000
		//６月の給料日：所持金￥0　やってもうた
		//…50000ずつ増える
		int month = 4;
		int money = 200000;
		while (month <= 8) {
			if (month == 6) {
				money = 0;
				System.out.println(month + "月の給料日：所持金\\" + money + "(やってもうた。)");
				month++;
			}
			System.out.println(month + "月の給料日：所持金\\" + (money+=50000));
				month++;
		}
	}

}
