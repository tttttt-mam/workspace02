package code15_14;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {

		//Instantの生成
		Instant i1 = Instant.now();//現在の日時を取得

		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();

		//ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();//現在の日時を取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		//InstantとZoneDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		//ZoneDateTimeの利用法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン；" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間をさしています");
		}

		System.out.println(z1);//localからzoneに変換（ロンドン時間）
		System.out.println(z2);//zoneからlocalでロンドン→東京に変更
		System.out.println(z3);//localからzoneに変換（東京時間）
		System.out.println(i3);//zoneからlocalに変換（タイムゾーン削除）

	}

}
