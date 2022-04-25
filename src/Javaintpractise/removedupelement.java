package Javaintpractise;

import java.util.Arrays;

public class removedupelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,30,20,10,30,40,50,60,10};
		Arrays.sort(arr);
		int length=arr.length;
		length=removedup(arr,length);

	}

	private static int removedup(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		if(n==0||n==1)
			return n;
		
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		//temp[j++]=arr[n-1];
		System.out.println("array");
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
			System.out.println(arr[i]);
		}
		return j;
	}

}
