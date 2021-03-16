package question;

public class Value {
	int value;

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public int touroku() {

		System.out.println("価名を登録してください");
		this.value = new java.util.Scanner(System.in).nextInt();
		return this.value;
	}
}