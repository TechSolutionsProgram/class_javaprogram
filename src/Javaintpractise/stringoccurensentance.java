package Javaintpractise;

public class stringoccurensentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//word occurance in the sentence
		
		String str1="Big black bug bit a big black dog on his big black nose";
		str1=str1.toLowerCase();
		String str[]=str1.split(" ");
	//	System.out.println(str.length);
		
	
		int fr[]=new int[str.length];
		char ch[]=new char[str.length];

		int visited=-1;
		for(int i=0;i<str.length;i++) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j]))
				{
					count++;
					fr[j]=visited;
					str[j]="0";
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
		}
		
		for(int i=0;i<str.length;i++) {
			if(str[i]!="0"&&fr[1]!=visited)
				System.out.println(str[i]+"     | "+fr[i]);
		}
	}

}
