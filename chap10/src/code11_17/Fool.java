package code11_17;

public class Fool extends Character implements Human, Runnable {

	//抽象クラスCharacterからhp、nameフィールドを継承している
	//抽象クラスCharacterから継承した抽象メソッドattack()を実装
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	//さらにインタフェースHumanから継承した4つの抽象メソッドを実装
	@Override
	public void talk() {
	}

	@Override
	public void watch() {
	}

	@Override
	public void hear() {
	}


}
