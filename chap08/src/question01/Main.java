package question01;

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 30;//時速
		c.fuel = 1000;//燃料

		c.showMenter(c.speed, c.fuel);
		c.accelarate(5);
		int a = c.run(3);//戻り値kyoriが返ってくるので改めてint aに代入
		System.out.println(a + "km");
		System.out.println(c.run(2));
		c.stop();
	}

}
