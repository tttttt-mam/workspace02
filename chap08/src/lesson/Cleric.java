package lesson;

import java.util.Random;

public class Cleric {

	String name;
	final int HP_MAX = 50;
	final int MP_MAX = 10;
	int hp = HP_MAX;
	int mp = MP_MAX;


	public void selfAid() {
		this.mp -= 5;
		this.hp = this.HP_MAX;
		System.out.println(this.name + "はセルフエイドを唱えた。");
		System.out.println("MPを" + this.mp + "消費してHPを" + MP_MAX + "まで回復した！");
	}

	public int pray(int sec) {
		int x = new Random().nextInt(2);
		int hoimi = x + sec;
		if (this.mp + hoimi >= this.MP_MAX) {
			this.mp = this.MP_MAX;
		} else {
			this.mp += hoimi;
		}

		System.out.println(this.name + "は" + sec + "秒祈った");
		System.out.println("MPが" + hoimi + "回復した");
		return hoimi;
	}


}
