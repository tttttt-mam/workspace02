package code15_06;

public class Main {

	public static void main(String[] args) {


		System.out.println("hoge".matches("HOGE"));
		System.out.println("hoge".matches("HOGE".toLowerCase()));//HOGEを小文字にしてから比較
		System.out.println("hoge".matches(".og."));
		System.out.println("hoge".matches("hoge2*"));//*の直線の文字2が0回出る
		System.out.println("hoge".matches("hoge2*."));//2がn回出た後任にの文字１がない
		System.out.println("hoge".matches("hoge2.*"));//hoge2がないためfalse
	}

}
