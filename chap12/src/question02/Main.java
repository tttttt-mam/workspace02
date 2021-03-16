package question02;

/**
本日の練習問題②

「猫クラス、犬クラス、鳥クラス」を作成して下さい。
「ペットホテル」クラスを作成して下さい。
ペットホテルクラスには「ペットを預かる」というメソッドを1つだけ作成し、
そのメソッドを実行すると以下の様に表示されるものとします。
■実行結果■
猫「あーこりゃ極楽じゃわい」
犬「ご主人様どこ行かはったんやろ？」
鳥「ペットホテルって鳥も利用できるんだ・・・」
 */
public class Main {

	public static void main(String[] args) {
		PetHotel[] pt = new PetHotel[3];

		pt[0] = new Cat();
		pt[1] = new Dog();
		pt[2] = new Bird();

		for (PetHotel s : pt) {
			s.stay();

	}

	}
}
