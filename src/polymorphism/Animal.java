package polymorphism;

public class Animal {
	public void eat() {
		System.out.println("grass");
	}
	
	public void eat(int age, String food) {
		System.out.println(age + "age and eat" + food);
	}
	
	public void eat(String food, int age) {
		System.out.println(food);
	}
	
	public void berk() {
		System.out.println("animal berk");
		
	}

}
