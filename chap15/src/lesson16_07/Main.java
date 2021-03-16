package lesson16_07;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		//ペアで格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		for (String key : prefs.keySet()) {//件名一覧を取得
			int value = prefs.get(key);//県名・キーを指定し人口・値を取得
			System.out.println(key + "の人口は" + value);
		}
	}

}
