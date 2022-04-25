package Javaintpractise;

public class reverseeachwordsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse each word in the sentence
		
		String str1="This is a best World";
		String str[]=str1.split(" ");
		System.out.println(str.length);
		
		String res="";
		for(int i=0;i<str.length;i++)
		{
			String t=str[i];
			for(int j=t.length()-1;j>=0;j--)
			{
				char ch=t.charAt(j);
				res=res+ch;
			}
			res=res+" ";
		}
		System.out.println(res);
		
	}

}
