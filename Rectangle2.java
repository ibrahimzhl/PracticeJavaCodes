package demo;

public class Rectangle2 {
int l, w;

Rectangle2 ()

{
	l=10;
	w=6;
}
void area (int l, int w)
{
	int area = l*w;
	System.out.println("Rectangle Area="+area);
	
}
    public static void main(String[] args) { 
    	Rectangle2 r1 = new Rectangle2 ();
    	r1.area(20, 14);
    	Rectangle2 r2 = new Rectangle2 ();
    	r1.area(30, 14);
    }
}
