package encapsolation;

public class CustomerMunna {
public static void main(String[] args) {
	BankOfAmerica bOfAmerica = new BankOfAmerica();
	bOfAmerica.setName("Munna");
	bOfAmerica.setDob(01012022);
	bOfAmerica.setBalance(500);
	
	System.out.println("My name is :"+ bOfAmerica.getName());
	
	BankOfAmerica bAmerica = new BankOfAmerica();
	bAmerica.setName("Nuzaira");
	bAmerica.setDob(02022022);
	
	System.out.println("My name is :"+ bAmerica.getName()+bAmerica.getDob());
}
}
