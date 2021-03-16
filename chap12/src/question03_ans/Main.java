package question03_ans;

public class Main {
	public static void main(String[] args) {
		Burger cb = new Cheese();
		cb.setCal(555);
		Burger tb = new Teriyaki();
		cb.setCal(600);
		Burger rb = new Rice();
		cb.setCal(473);
		double totalCal = 0;
		Burger[] burgers = { cb, tb, rb };
		for (Burger bg : burgers) {
			totalCal += bg.getCal();
		}
		System.out.println("バーガー3種食べたら"+totalCal+"カロリー");
	}

}
