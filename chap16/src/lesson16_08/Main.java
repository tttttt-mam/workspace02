package lesson16_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		List<Hero> names = new ArrayList<>();

		names.add(h1);
		names.add(h2);

		for (Hero h : names) {
			System.out.println(h.getName());
		}

		Map<Hero, Integer> wins = new HashMap<Hero, Integer>();
		{
			wins.put(h1, 3);
			wins.put(h2, 7);
		}

		for (Hero key : wins.keySet()) {
			int value = wins.get(key);

			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}

}
