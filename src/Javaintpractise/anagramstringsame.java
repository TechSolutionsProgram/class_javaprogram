package Javaintpractise;

import java.util.Arrays;

public class anagramstringsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check the length to be same and then sort the array and compare both are equal
		
		String str1="Grab";
		String str2="Brag";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!= str2.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char Str1[]=str1.toCharArray();
			char Str2[]=str2.toCharArray();
			Arrays.sort(Str1);
			Arrays.sort(Str2);
			if(Arrays.equals(Str1,Str2)==true)
				System.out.println("Both the string are Anagram");
			else
				System.out.println("Both the string are not Anagram");
			
		}
			

	}

}
