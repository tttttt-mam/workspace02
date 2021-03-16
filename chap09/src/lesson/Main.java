package lesson;

public class Main {

	public static void heal(int hp) {
		hp += 10;//この変数hpはどこにも使われない
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);

		System.out.println(baseHp + ":" + t.hp);
		heal(baseHp);
		heal(t);//ｔの参照先が変更される
		System.out.println(baseHp + ":" + t.hp);
	}

}
