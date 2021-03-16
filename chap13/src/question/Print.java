package question;

public class Print {

	private String name;
	private int value;

	public void print(String name, int value) {
		System.out.println(name + "\t" + value + "円");
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
