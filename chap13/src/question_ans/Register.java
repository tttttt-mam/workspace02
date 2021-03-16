package question_ans;


public class Register {
	public void okaiage(Goods g1, Goods g2, Goods g3) {
		System.out.println("■■購入商品■■");
		System.out.println(g1.getGoodsName() + "\t" + g1.getGoodsPrice() + "円");
		System.out.println(g2.getGoodsName() + "\t" + "\t" + g2.getGoodsPrice() + "円");
		System.out.println(g3.getGoodsName() + "\t" + "\t" + "\t" + g3.getGoodsPrice() + "円");
		int goukei = g1.getGoodsPrice() + g2.getGoodsPrice() + g3.getGoodsPrice();
		System.out.println("お買い上げ合計" + "\t" + "\t" + goukei + "万両");
	}
}