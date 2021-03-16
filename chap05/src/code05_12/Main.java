package code05_12;

public class Main {

	//int配列を受け取って全部表示するprintArrayメソッド
	public static void printArray(int[] array) {

		for (int element : array) {
			System.out.println(element);
		}
		array[0] = 10;
	}

	//メインメソッド
	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };
		printArray(array);//printArrayメソッドへ引数1，2，3（配列）を渡す

		System.out.println(array[0]);//10
	}

}
