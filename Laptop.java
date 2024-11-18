package demo;

public class Laptop {
	
	String Color;
	String  Company;
	
	void printDetails() {
		System.out.println("Color = "+Color);
		System.out.println("Company = "+Company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop b1 = new Laptop ();
		b1.Color = "Silver";
		b1.Company = "HP";
		
		Laptop b2 = new Laptop ();
		b2.Color = "Black";
		b2.Company = "Dell";
		
		b1.printDetails();
		b2.printDetails();

	}

}