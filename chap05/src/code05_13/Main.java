package code05_13;

public class Main {

	//array配列を受け取って1足すincArrayメソッド
	public static void incArray(int[] arrayA) {

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i]++;
		}
	}

	//メインメソッド
	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };

		incArray(array);//メソッド実行

		for (int i : array) {
			System.out.println(i);//array出力

		}
	}

}
