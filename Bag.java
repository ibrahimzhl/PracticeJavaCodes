package demo;

public class Bag {
	
	String color;
	String size;
	
	void printDetails() {
		System.out.println("Color = "+color);
		System.out.println("Size = "+size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag b1 = new Bag ();
		b1.color = "Red";
		b1.size = "Big";
		
		Bag b2 = new Bag();
		b2.color = "Blue";
		b2.size = "Small";
		
		b1.printDetails();
		b2.printDetails();

	}

}