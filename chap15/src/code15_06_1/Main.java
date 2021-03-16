package code15_06_1;

public class Main {

	public static void main(String[] args) {


		System.out.println("hoge".matches("[a-z]"));//1文字じゃない
		System.out.println("hoge".matches("[a-z0-9]*"));
		System.out.println("hoge".matches("[a-z]{5}"));//5文字じゃない
		System.out.println("hoge".matches(".*e$"));
		System.out.println("こんにちわ".matches("[あ-ん]*"));
		System.out.println("九".matches("[一-十]*"));
		System.out.println("参".matches("[壱-拾]*"));

	}

}
