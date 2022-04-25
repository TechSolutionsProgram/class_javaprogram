package Javaintpractise;

public class dupcountallnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//find the count of each number in the array
		
		int arr[]= {1,2,2,3,4,5,3,4,5,3,4,1,2,3,5,6};
		int n=arr.length;
		countnum(arr,n);

	}

	private static void countnum(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		//create an array to update the number frequency
		int fr[]=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				//check the element is equal and add visited in the freq array
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=visited;
				}
				
			}
			//if the element not visited make count=1
			if(fr[i]!=visited)
			{
					fr[i]=count;
			}
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(fr[i] !=visited)
			{
				System.out.println(arr[i]+ " | "+fr[i]);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(fr[i]==1)
			{
				System.out.println("on repeatitive"+arr[i]+ " | "+fr[i]);
			}
		}
		
		
	}

}
