package question02_ans;

public class PetHotel {
	private String name;
	private int price;

	public void service(Animal[] ani) {
		for(Animal a:ani) {
			a.stay();
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
