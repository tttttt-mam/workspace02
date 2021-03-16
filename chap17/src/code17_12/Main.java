package code17_12;

public class Main {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileExepition("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
