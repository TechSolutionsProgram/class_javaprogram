package Javaintpractise;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome string
		
		String str="Kayak23";
		str=str.toLowerCase();
		boolean flag=true;
		
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;
				break;
			}
		}

		if(flag==true)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
