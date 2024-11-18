package demo;

public class SortingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write the smallest number from given array

		int a = 10, b = 20, c = 55;
		if (a < b && a < c) {
			System.out.println("a is smallest");
		} else if (b < c && b < a) {
			System.out.println("b is smallest");
		}

		else {
			System.out.println("c is smallest");
		}
	}
}