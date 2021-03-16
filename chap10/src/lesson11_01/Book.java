package lesson11_01;

public class Book extends TangibleAsset {

	String isbn;

	//コンストラクタ
	public Book(String name, int price, String color, Double weigth, String isbn) {
		super(name, price, color, weigth);
		this.isbn = isbn;
	}

	//メソッド
	public String getIsbn() {
		return this.isbn;
	}


}
