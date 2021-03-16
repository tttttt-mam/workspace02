package code05_03;

public class Main {

	//methodAメソッド本体
	public static void methodA() {
		System.out.println("methodA");
		methodB();						//methodBメソッドを呼び出す
	}

	//methodBメソッド本体
	public static void methodB() {
		System.out.println("methodB");
	}

	//mainメソッド
	public static void main(String[] args) {
		methodA(); 						//methodAメソッドを呼び出す

	}

}
