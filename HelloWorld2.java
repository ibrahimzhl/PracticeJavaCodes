
//method overloading - sub with 2 parameter and more
	//WAP overloading div to div 2 numbers, 2 double numbers
	//method overloading
	//1. methods with same name but diff number of parameter
	//2. same  name diff type of parameter

		package demo;

		public class HelloWorld2 {
			//method overloading 
			static void div (int a, int b)
			{
				System.out.println(a/b);
			}
		static void div(int a , int b, int c)
		{
			System.out.println(a/b/c);
		}
		static void div (double a, double b)
		{
			System.out.println(a/b);
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		    div(100,5);
		    div(48,4,2);
		    div(168.50,10.50);
		    
			}

		}