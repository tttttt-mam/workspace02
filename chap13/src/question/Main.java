package question;

public class Main {

	public static void main(String[] args) {

		Product p = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Value v = new Value();
		Value v2 = new Value();
		Value v3 = new Value();
		Print pri = new Print();


		p.touroku();
		v.touroku();
		p2.touroku();
		v2.touroku();
		p3.touroku();
		v3.touroku();


		pri.print(p.getName(), v.getValue());
		pri.print(p2.getName(), v2.getValue());
		pri.print(p3.getName(), v3.getValue());
	}


}
