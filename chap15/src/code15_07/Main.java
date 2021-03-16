package code15_07;

public class Main {

	public static void main(String[] args) {

		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}

		String w = "\n今日は3月3日ひなまつり";
		String[] nichi = w.split("日");
		System.out.println(nichi[0]);
		System.out.println(nichi[1]);
		System.out.println(nichi[2]);

	}

}
