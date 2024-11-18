package demo;

public class Dog extends Animal {
	
	String color;
	//overriding - same name and same no. of parameters
	void display ()
	{
		super.display();
		System.out.println("Color = "+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Dog d1 = new Dog ();
 d1.age = 1;
 d1.cat = "Abc";
 d1.color = "Black";
 d1.display();
 
	}
}