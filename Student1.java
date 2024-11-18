package demo;

//Polymorphsisim - same name and multiple forms
//1. method overloading - methods can have same name but diff number of para or type of para
//2. method over riding - methods can have same name and same number of para but in inheritance

class Student1 {
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
			Student1 s1 = new Student1();
			s1.name = "Zuhal";
			s1.age = 20;
			s1.address = "USA";
			s1.display();
			
		}
	}

}
