package Abstraction;

public class Customer {
	public static void main(String[] args) {
		Grocery grocery ;
		
		grocery = new KFC();// here KFC concret class aso a subclass f grocery
		grocery.rawCut();
		grocery.egg();
		grocery.chicken();
		
		grocery = new McDonalds();
		grocery.rawCut();
		grocery.egg();
	}

}
