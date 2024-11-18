package demo;

public class Shape {

	int side;
	
	Shape()
	{
		side = 5;
	}
	
	int area(int s)
	{
		int a = s*s;
		return a;
	}
	public static void main(String[] args) {
		Shape sq = new Shape ();                //constructor will be executed - default
		sq.area(11);
		
	}
}
