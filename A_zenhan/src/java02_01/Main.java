package java02_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*第２章の追加練習問題 (１)
		ネットショップに設置する金額計算プログラムを作成しています。
		以下の条件のプログラムを作成してください。

		＜条件＞
		コンソールに、下記のように表示されること。
		商品単価(税抜)：100
		個数         ：10
		消費税       ：0.08
		------------------------------
		金額(税込)   ：1080

		*/

		double value = 100;
		double num = 10;
		double tax = 0.08;

		System.out.println("商品単価(税抜)：" + (int)value);
		System.out.println("個数\t\t：" + (int)num);
		System.out.println("消費税\t\t：" + tax);
		System.out.println("------------------------------");
		double sum = (value * num) *(tax+1);
		System.out.println("金額(税込)\t：" + (int)sum);

	}

}
