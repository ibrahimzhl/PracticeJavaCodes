package demo;

public class FindNumberOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Rayhana Ibrahim";
 
		char ch[] = str.toCharArray();
		int count =0;
 //['R','a','y','h','a','n','a',' ','I','b','r','a','h','i','m',]
 for (int i=0;i<str.length(); i++)
 {
	 if (ch[i]=='r')
	 {
		 count ++;
		 
	 }
	}
System.out.println("Number of Occurance of char r = "+count);
}
}