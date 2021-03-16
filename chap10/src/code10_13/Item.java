package code10_13;

public class Item {

	String name;
	int price;

	//引数1個のコンストラクタ
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}

	//引数2個のコンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;

	}
}
