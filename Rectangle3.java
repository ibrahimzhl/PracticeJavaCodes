package demo;

public class Rectangle3 { //Compare Areas
int l, w;

Rectangle3 ()
{
	l=10;
	w=6;
}
    int area (int l, int w)
{
	int area = l*w;
	return area;
}
    public static void main(String[] args) { 
    	Rectangle3 r1 = new Rectangle3 ();
    	int a1 =	r1.area(20, 14);
    	System.out.println("Rectangle1 Area="+a1);
    
    	Rectangle3 r2 = new Rectangle3 ();
    	int a2 =	r1.area(15, 14);
    	System.out.println("Rectangle2 Area="+a2);
    	
    	if (a1>a2)
    	{
    		System.out.println("Area of rectangle 1 is greater than rectangle 2");
    	}
    	else {
    		System.out.println("Area of rectangle 2 is greater than rectangle 1");
    	}
}
}