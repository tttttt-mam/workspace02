package code09_08;

public class Hero {
	String name;
	int hp;

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}

	public Hero() {
		this("ダミー");

	}
}
