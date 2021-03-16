package question02_ans;


public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public abstract void cry();

	public abstract void stay();

	public Animal() {

	}

}
