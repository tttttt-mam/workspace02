package question_ans;

public class Goods {

	private String goodsName;
	private int goodsPrice;

	public Goods(String goodsName) {
		this.goodsName = goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsPrice(int price) {
		this.goodsPrice = price;
	}

	public int getGoodsPrice() {
		return this.goodsPrice;
	}
}
