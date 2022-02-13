package polymorphism;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("dog food");
	}
	
	@Override
	public void berk() {
		System.out.println("bow bow");
	}

}
