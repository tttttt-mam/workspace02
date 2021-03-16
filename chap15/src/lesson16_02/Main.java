package lesson16_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//ArrayList宣言
		ArrayList<String> names = new ArrayList<String>();
		//要素を末尾に追加
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		Iterator<String> it = names.iterator();//イテレータ
		//要素取り出し
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
}

	}

}
