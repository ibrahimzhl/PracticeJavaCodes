package demo;

public class Person {

	int age;
	String name;
	String address;
	
	void display ()
	{
		System.out.println("Age=" +age);
		System.out.println("Name=" +name);
		System.out.println("Address=" +address);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Person s1 = new Person();
			s1.name = "Zuhal";
			s1.age = 20;
			s1.address = "USA";
			s1.display();
			
		}
	}

}
