package code15_08;

public class Main {

	public static void main(String[] args) {

		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);


		String x = "123.456";
		String y = x.replace(".", ",");
		String z = y.replaceAll(".", ",");//正規表現可なので.は1文字判定
		System.out.println(y);
		System.out.println(z);

	}
}
