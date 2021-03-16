package code05_14;

public class Main {

	//int型配列を作成して戻すメソッド
	public static int[] makeArray(int size) {

		int[] newArray = new int[size];//3つの要素があるnewArray配列を宣言

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;//newArrayにｉを代入
		}
		return newArray;//配列を戻す
	}


	//メインメソッド
	public static void main(String[] args) {

		//makeArrayメソッドに3を渡して呼び出し、newArray配列を受け取りarrayへ代入
		int[] array = makeArray(3);

		for (int i : array) {
			System.out.println(i);//array出力

		}
	}

}
