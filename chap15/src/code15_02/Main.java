package code15_02;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java ando JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf(74));//char74番目の文字「J」

	}

}
