package demo;
//Extends Person - Overriding

	class Student2 extends Person {
		int roll;
		void display()
		{
			
				super.display();
				System.out.println("Roll = "+roll);
			}	
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			{
		Student2 s2=new Student2();
		s2.name = "Zuhal";
		s2.age = 20;
		s2.address = "absd";
		s2.roll = 25;
		s2.display();
		
	}
		}
	}

