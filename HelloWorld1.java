package demo;

public class HelloWorld1 {
	//method overloading 
	static void add (int a, int b)
	{
		System.out.println(a+b);
	}
static void add(int a , int b, int c)
{
	System.out.println(a+b+c);
}
static void add (double a, double b)
{
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    add(10,20);
    add(30,40,50);
    add(16.50,10.50);
    
	}

}
