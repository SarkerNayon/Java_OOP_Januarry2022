package encapsolation;

public class BankOfAmerica {

	private String name;
	private int dob;
	private int Balance;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public int getDob() {
		return dob;
	}
	public int getBalance() {
		return Balance;
	}
	
	
	
}
