package code05_07;

public class Main {

	public static void main(String[] args) {
		//addメソッドに100、10を渡しながら呼び出す
		int ans = add(100, 10);
		//addメソッドで計算したansを表示
		System.out.println("100 + 10 = " + ans);
	}

	public static int add(int x, int y) {
		int ans = x + y;//受け取った100，10を計算
		return ans;//変数ansをメインメソッドへ渡す
	}

}
