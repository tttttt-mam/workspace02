package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Java\n");
		}

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

		long start1 = System.currentTimeMillis();

		String s = "Java";
		for (int i = 0; i < 100000; i++) {
			s = s + ("Java");
		}

		long end1 = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end1 - start1) + "ミリ秒でした");

	}

}
