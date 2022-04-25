package Javaintpractise;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//largest contiguous sum
		int a[]= {5, -4, -2, 10, -5};
		int max=maxcontiguous(a);
		System.out.println(max);

	}

	private static int maxcontiguous(int[] a) {
		// TODO Auto-generated method stub
		int max=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=count+a[i];
			if(count>max) {
				max=count;
			}
			if(count<0)
			{
				count=0;
			}
		}
		return max;
		
		
	}

}
