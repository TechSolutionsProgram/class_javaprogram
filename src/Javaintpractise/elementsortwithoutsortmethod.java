package Javaintpractise;

public class elementsortwithoutsortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sort the array without using the array sort
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		
		int temp;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
		
	}

}
