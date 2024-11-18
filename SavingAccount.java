package code;

public class SavingAccount implements Bank{
	
	
	public void calculateInterest() {
	}

	public void calculateTax() {
	}
	
	public void calculateEmi() {
	}
	public static void main (String [] args) {
		SavingAccount s1 = new SavingAccount();
		s1.calculateEmi();
	}
}
