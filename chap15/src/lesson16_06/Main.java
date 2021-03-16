package lesson16_06;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		//ペアで格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		int tokyo = prefs.get("東京都");//キーを指定して取得
		System.out.println("東京都の人口は" + tokyo);

		prefs.remove("京都府");//京都を削除

		prefs.put("熊本県", 182);//熊本を上書き
		int kumamoto = prefs.get("熊本県");//キーを指定して取得
		System.out.println("熊本県の人口は" + kumamoto);

		System.out.println(prefs.keySet());//キーの一覧、京都が削除されている

	}

}
