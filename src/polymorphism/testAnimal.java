package polymorphism;

public class testAnimal {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.eat();
//		dog.berk();
//		
		Cat cat = new Cat();
		cat.eat();
		cat.berk();
		cat.eat("fish", 3);
		cat.eat(4, "tuna");

	}

}
