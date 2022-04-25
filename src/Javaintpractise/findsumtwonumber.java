package Javaintpractise;

public class findsumtwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		int arr[]= {2,4,3,6,8,9,10};
		int total=10;
		
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==total)
				{
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}

	}

}
