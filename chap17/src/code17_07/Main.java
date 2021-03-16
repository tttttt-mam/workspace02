package code17_07;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");

		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;//なにもしない（；は記述忘れじゃないよマーク）
			}
		}

	}

}
