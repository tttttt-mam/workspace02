package lesson05_01;

public class Main05_3 {

	public static void main(String[] args) {

		String title = "タイトル";
		String address = "アドレス";
		String text = "内容";
		email(title, address, text);
		email(address, text);
		System.out.println();
	}

	public static void email(String title, String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void email(String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

}
