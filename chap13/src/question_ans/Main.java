package question_ans;

public class Main {

	public static void main(String[] args) {

		Goods g1 = new Goods("ブラックサンダー1");
		g1.setGoodsPrice(30);
		Goods g2 = new Goods("ブラックサンダー2");
		g2.setGoodsPrice(302);
		Goods g3 = new Goods("ブラックサンダー3");
		g3.setGoodsPrice(303);


		Register regi = new Register();
		regi.okaiage(g1, g2, g3);

	}


}
