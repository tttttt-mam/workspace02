package lesson11_01;

public class Computer extends TangibleAsset implements Thing {

	String makerName;
	double weigth;

	//コンストラクタ
	public Computer(String name, int price, String color, Double weigth, String makerName) {
		super(name, price, weigth, color, weigth);
		this.makerName = makerName;
	}

	//メソッド
	public String getMakerName() {
		return this.makerName;
	}


}
