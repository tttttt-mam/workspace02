package code05_08;

public class Main {

	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40)));//100
		//２つ目のadd=30、３つ目のadd=70、１つ目のaddで30と70が足されて100となる

	}

	public static int add(int x, int y) {
		//int ans = x + y;//受け取った値を計算
		//return ans;//変数ansをメインメソッドへ渡す
		return x + y ;//←この方法もある

	}

}
