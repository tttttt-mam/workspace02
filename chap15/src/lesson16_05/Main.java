package lesson16_05;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");

		//string型は辞書順に自動そーとされる
		for (String s : words) {
			System.out.print(s + "→");
		}
	}

}
