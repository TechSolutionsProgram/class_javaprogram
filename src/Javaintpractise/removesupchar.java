package Javaintpractise;

import java.util.Arrays;

public class removesupchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove the duplicate in the string
		
		String str="abdferadfervsdfgs";
		char ch[]=str.toCharArray();
		int j=0;
		Arrays.sort(ch);
		int length=str.length();
		length=duplicate(ch,length);
		System.out.println(length);

	}

	private static int duplicate(char[] ch, int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1)
			return n;
		
		char[] temp=new char[n];
		//int j=0;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1])
				{
					ch[i]='0';
				}
			
		}
		int j=0;
		for( int i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
				{
					System.out.println(ch[i]);
					j++;
				}
		}
		
		return j;
	}

}
