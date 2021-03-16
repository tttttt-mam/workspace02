package code15_09;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.Name = "minato";
		hero.getJob = "sensi";
		hero.getGold = 1234001234;
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.Name, hero.getJob, hero.getGold);
		System.out.print(s);
	}

}
