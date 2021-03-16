package lesson05_01;

public class Main05_4 {

	public static void main(String[] args) {

		double bottom = 10.0;
		double hight = 5.0;
		double readius = 5.0;

		System.out.println(clacTriangleArea(bottom, hight));
		System.out.println(clacCicleArea(readius));
		System.out.println(String.format("値は「%.1f」です。",clacCicleArea2(readius)));

		//System.out.println(ans);
	}

	public static double clacTriangleArea(double x, double y) {

		return x * y / 2;
	}

	public static double clacCicleArea(double x) {

		//return x * x * 3.14;
		return Math.PI * Math.pow(x, 2);//xの二乗

	}

	public static double clacCicleArea2(double x) {
		return Math.PI * Math.pow(x, 2);//xの二乗


	}

}
