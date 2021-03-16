package lesson13;

public class Wizard {
	private int hp;
	private int mp;
	String name;
	Wand wand;

	Hero h = new Hero();


	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.power);
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public String getName(String name) {
		return this.name;
	}

}
