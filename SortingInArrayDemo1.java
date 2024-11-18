package demo;

public class SortingInArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 0 1 2 
		int arr[]= {20,5,2};
		int temp;
		for(int i=0;i<3;i++)
		{
			for (int j=i+1;j<3;j++)
			{
				if (arr[i]>arr[j]) //20>5 t
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
			}
		}			
		}
              for (int i=0;i<3;i++) {
         	System.out.println(arr[i]);
}
}
}
