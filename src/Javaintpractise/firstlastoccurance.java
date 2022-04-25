package Javaintpractise;

import java.util.Arrays;

public class firstlastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print the first and final occurrence of a number in a sorted array of integers.
		//e.g. int[] list = {1,2,3,4,5,5,7,8}
		
		int list[]={1,2,3,4,5,5,7,8};
		Arrays.sort(list);
		int x=5;
		
		firstlastoccurrence(list,list.length);
	}

	private static void firstlastoccurrence(int[] arr, int x) {
		// TODO Auto-generated method stub
		int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");		
	}

}
