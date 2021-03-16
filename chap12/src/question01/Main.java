package question01;

//* 本日の練習問題①
/*「猫クラス、犬クラス、鳥クラス」を作成して下さい。
メソッドの実行文を1度しか書かずに、以下の実行結果を得て下さい。
■実行結果■
猫が鳴く「みゃーみゃー」
犬が鳴く「わんわん」
鳥が鳴く「ぎーよぎーよ」*/

public class Main {

	public static void main(String[] args) {

		Animal[] al = new Animal[3];

		al[0] = new Cat();
		al[1] = new Dog();
		al[2] = new Bird();

		for (Animal s : al) {
			s.cry();
		}


	}

}
