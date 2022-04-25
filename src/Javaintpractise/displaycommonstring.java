package Javaintpractise;

public class displaycommonstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displya only the common characters

		String a="Strong";
		String b="String";
		char count[] = new char[50];
		char ch1[]=a.toCharArray();
		char ch2[]=b.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			for (int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
					count[i]=ch1[i];
			}
			if(count[i]!=' ') {
			System.out.println(count[i]);
			}
		}
	}

}
