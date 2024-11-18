package demo;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "Zuhal";
           String newstr ="";

          // output cbA
 
          for (int i = str.length()-1;i>=0;i--)
          {
        	  
		  newstr = newstr + str.charAt(i);
	}

          System.out.println(newstr);
}
	
}