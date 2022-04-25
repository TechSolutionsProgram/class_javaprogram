package Javaintpractise;

public class duplicatenumbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the duplicate number count in the array
		
		int arr[]= {1,2,2,3,4,5,3,4,5,3,4};
		int x=4;
		int n=arr.length;
		countnum(arr,n,x);

	}

	private static void countnum(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
