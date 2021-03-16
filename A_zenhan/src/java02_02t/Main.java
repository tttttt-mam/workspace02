package java02_02t;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		第２章の追加練習問題 (２)
		下記実行例のように、税込価格を入力すると、
		入力した金額が500円～1,000円だった場合は、20%OFFした金額を表示する。
		それ以外だった場合は10%OFFの金額を表示する。
		実行例
		税込価格500円～1,000円の商品は20%OFF！！
		それ以外の商品は10%OFF！！

		[税込価格を入力]>600
		割引適用価格：480円
		*/

		System.out.println("税込価格500円～1,000円の商品は20%OFF！！");
		System.out.println("それ以外の商品は10%OFF！！");
		System.out.println("");

		System.out.println("[税込価格を入力]");
		int price = new java.util.Scanner(System.in).nextInt();

		double priceoff = price>=500&&price<=1000?0.8:0.9;
		price = (int)(price*priceoff);
		System.out.println("割引適用価格："+price+"円");


	}

}
