package code16_08;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}


public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);//hをリストに格納
		h.name = "スガワラ";//格納後にhのnameを書き換え

		//スガワラになる※変数hやリストの値は参照であるため
		System.out.println(list.get(0).name);
		//h.nameと list.get(0).nameの参照値は同じであるため
	}

}
