package question02_ans;

public class Main {
	public static void main(String[] args) {
	Animal ct = new Cat();
	Animal dg = new Dog();
	Animal bd = new Bird();
	Animal [] animals = {ct,dg,bd};
	for(Animal ani:animals) {
		ani.cry();
	}
	PetHotel pt = new PetHotel();
	pt.service(animals);
	}

}
