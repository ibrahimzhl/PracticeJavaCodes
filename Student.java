package demo2;

public class Student {
	
	int id;  //instance variable
	String name;  //instance variable
	
	Student ()  //default constructor 
	{
		id = 10;
		name = "Test";
	}
	// this keyword  - refers to current class instance variable
	Student(int id1, String name1) //parameterised cosntructor
	{
		this.id = id1;
		this.name = name1;
	}
void display()
{
	System.out.println ("Name=" +name);
	System.out.println ("Id=" +id);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(); //default constructor is called automatically
		Student s2 = new Student(2, "Rayhana"); //parameterized constructor
		s1.display();
		s2.display();
	}

}
