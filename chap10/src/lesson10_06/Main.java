package lesson10_06;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		PoisonMatango pm2 = new PoisonMatango('B');
		pm2.attack(h);

		System.out.println(h.name + "のHP:" + h.hp);
	}

}
