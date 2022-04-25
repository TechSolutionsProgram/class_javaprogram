package Javaintpractise;

public class moveelementzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,0,2,3,0,4,5,0,6,0,2};
		printzero(arr);
		
	}

	private static void printzero(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

