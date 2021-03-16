package lesson11_01;

public abstract class TangibleAsset extends Asset implements Thing {

	String color;
	double weigth;

	//コンストラクタ
	public TangibleAsset(String name, int price) {
		super(name, price);
		this.color = color;
		this.weigth = weigth;
	}

	//メソッド

	public String getColor() {
		return this.color;
	}

	public double getWeigth() {
		return this.weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

}

