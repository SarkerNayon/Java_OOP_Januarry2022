package Abstraction;

public abstract class Grocery implements ChickenFarm {
	@Override
	public void egg() {
		System.out.println("Omlet");

	}
	@Override
	public void chicken() {
		System.out.println("B.B.Q");
		
	}
	
	public abstract void rawCut();

}
