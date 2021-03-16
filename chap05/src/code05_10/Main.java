package code05_10;

public class Main {
	//１つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}

	//２つ目のaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}

	//３つ目のaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}

	//4つ目のaddメソッド
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	//5つ目のaddメソッド
	public static String add(int x, String y) {
		return x + y;
	}

	//6つ目のaddメソッド
	public static String add(String x, int y) {
		return x + y;
	}

	public static void main(String[] args) {

		System.out.println(add(3, 5));//１つ目のaddメソッドが呼び出される
		System.out.println(add(3.5, 2.7));//２つ目のaddメソッドが呼び出される
		System.out.println(add("Hello", "World"));//３つ目のaddメソッドが呼び出される
		System.out.println(add(10, 20, 30));//4つ目のaddメソッドが呼び出される
		System.out.println(add(10, "020"));//5つ目のaddメソッドが呼び出される
		System.out.println(add("10", 20));//6つ目のaddメソッドが呼び出される
	}

}
