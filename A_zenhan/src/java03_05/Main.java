package java03_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
第３章の追加練習問題 (5)
for文のトレーニング③
for文を使って下記のようにコンソールに表示してください。
実行例
*
  *
   *
    *
     *
      *
       *
        *
         *


		*/

		String num = "";
		for (int i = 0; i < 10; i++) {
		//	for (int j = 0; j < i; j++) {
				System.out.print(num);
				num +=" ";
				System.out.println("*");
		//	}
			//System.out.println();
		}
	}
}