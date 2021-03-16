package lesson;

public class Main {

	public static void main(String[] args) {
		//クラスClericからインスタンスを生成し変数hに格納
		Cleric h = new Cleric(); //1.勇者1を生成


		//2.フィールドhに初期値をセット
		h.name = "ミナト";
		System.out.println("聖職者" + h.name + "を生み出しました！");


		//3.勇者のメソッドを呼び出していく
		h.selfAid(); //
		System.out.println(h.name + " HP:" + h.hp + " MP:" + h.mp);

		h.pray(4); //

		System.out.println(h.name + " HP:" + h.hp + " MP:" + h.mp);
	}

}
