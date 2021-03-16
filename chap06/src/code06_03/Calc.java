package code06_03;

public class Calc {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;

		int total = ClacLogic.tasu(a, b);
		int delta = ClacLogic.hiku(a, b);

		System.out.println("足すと" + total + "引くと" + delta);

	}


}
