package code15_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		//文字列からLocalDateを作成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate lDate = LocalDate.parse("2020/09/22", fmt);//parse()文字列作成

		//1000日後を計算する//plus**(値)…値分日付を足す。**は日付時間単位
		LocalDate ldatep = lDate.plusDays(1000);
		String str = ldatep.format(fmt);//DateTimeFormatterで指定した形式にstrへ格納
		System.out.println("1000日後は" + str);

		//現在日付との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
	}

}
