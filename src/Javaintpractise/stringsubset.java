package Javaintpractise;

import java.util.ArrayList;
import java.util.List;

public class stringsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the substring
		
		int[] S1 = {1,5,4,6,8,2};
		int[] S2 = {5,8,2};
		int[] S3 = {5,8,2,7};
		
		List<Integer> s1list=new ArrayList<Integer>();
		for(int s:S1) {
			s1list.add(s);
			
		}
		System.out.println(s1list);
		List<Integer> s2list=new ArrayList<Integer>();
		for(int s:S2) {
			s2list.add(s);
			
		}
		System.out.println(s2list);
		List<Integer> s3list=new ArrayList<Integer>();
		for(int s:S3) {
			s3list.add(s);
			
		}
		System.out.println(s3list);
		
		boolean isSubset=false;
		for(int s:s2list) {
			if(s1list.contains(s)) {
				isSubset=true;
			}
			else {
				isSubset=false;
				break;
			}
			
		}
		
		System.out.println("is s2 is subset: "+isSubset);
		
		//boolean isSubset=false;
		for(int s:s3list) {
			if(s1list.contains(s)) {
				isSubset=true;
			}
			else {
				isSubset=false;
				break;
			}
			
		}
		System.out.println("is s3 is subset: "+isSubset);
		//System.out.println("is s2 is subset"+isSubset);
			
		
	}

}
