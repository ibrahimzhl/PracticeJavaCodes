package demo;

public class Rectangle {
int l, w;

Rectangle ()

{
	l=10;
	w=6;
}
void area ()
{
	int area = l*w;
	System.out.println("area="+area);
	
}
    public static void main(String[] args) { 
    	Rectangle r1 = new Rectangle ();
    	r1.area();
    }
}
