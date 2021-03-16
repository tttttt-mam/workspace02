package lesson15_09;

public class lesson15_01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");

	}
		System.out.println(sb);

		String s=sb.toString();
		String[] a = s.split(",");

	}
}