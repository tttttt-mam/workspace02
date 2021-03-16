package code05_04;

public class Main {

	//mainメソッド
	public static void main(String[] args) {

		System.out.println("メソッドを呼び出します");

		hello("湊"); //""を渡してhelloメソッドを呼び出す
		hello("朝香"); //""を渡してhelloメソッドを呼び出す
		hello("菅原"); //""を渡してhelloメソッドを呼び出す
		//hello(); //errorとなる

		System.out.println("メソッドの呼び出しが終了しました");

	}

	//引数付きhelloメソッド本体
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちわ");
	}
}
