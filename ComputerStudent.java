package demo2;

public class ComputerStudent extends Student{

	int javaMarks;
	
	ComputerStudent()
	
	{
	id=10;
	name="Zuhal";
	javaMarks = 20;
	}
	
	ComputerStudent (int id, String name, int javaMarks)
	{
		super.id= id;
		super.name = name;
		this.javaMarks = javaMarks;
	}
	
	void display()
	{
	super.display();
	System.out.println("Java Marks ="+javaMarks);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ComputerStudent cs1 = new ComputerStudent();
     ComputerStudent cs2 = new ComputerStudent(3, "Rayhana", 30);
     cs1.display();
     cs2.display();
	}

}
