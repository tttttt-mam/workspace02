package lesson10_06;

public class PoisonMatango extends Matango {

	int poison = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}


	public void attack(Hero h) {
		super.attack(h);
		if (this.poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			System.out.println(h.hp / 5 + "ポイントのダメージ");
			h.hp -= h.hp / 5;
			this.poison--;
		}
	}
}