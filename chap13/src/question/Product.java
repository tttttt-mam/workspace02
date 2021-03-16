package question;

public class Product {

	private String name;


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String touroku() {
		System.out.println("商品名を登録してください");
		this.name = new java.util.Scanner(System.in).nextLine();
		return this.name;

	}
}
