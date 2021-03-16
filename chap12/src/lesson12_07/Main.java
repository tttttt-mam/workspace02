package lesson12_07;

public class Main {

	public static void main(String[] args) {
		Y[] yyy = new Y[2];
		yyy[0] = new A();
		yyy[1] = new B();

		for (Y s : yyy) {
			s.b();

		}
	}

}
