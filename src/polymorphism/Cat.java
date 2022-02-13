package polymorphism;

public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("cat food");
	}
	
	
	@Override
	public void berk() {
		super.berk();// acting like object of the super class
	}

}
