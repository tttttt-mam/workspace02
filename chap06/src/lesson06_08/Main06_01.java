package lesson06_08;

public class Main06_01 {

	public static void main(String[] args) throws Exception {
		doWarusa(); //前半
		doTogame(); //前半
		callDeae(); //後半
		showMondokoro(); //後半

	}

	public static void doWarusa() {
		System.out.println("きなこでござる。食えませんがの");
	}

	public static void doTogame() {
		System.out.println("この老いぼれの目はごまかせませんぞ。");
	}

	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}

	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		doTogame(); //もう一度、とがめる

	}
}
