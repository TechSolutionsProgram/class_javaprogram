package Javaintpractise;

public class duplicatestringoccurnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//another way to identify the duplicates
		
		String str="This is the best world";
		Stringoccur(str);
		Stringoccur("QA Training");
	}
	
		private static void Stringoccur(String str) {
		// TODO Auto-generated method stub
			System.out.println("duplicate occurance");
			int n=str.length();
			char ch[]=str.toCharArray();
			int fr[]=new int[n];
			int visited=-1;
			char visit='0';
			for(int i=0;i<n;i++) {
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(ch[i]==ch[j]&& ch[i]!=' ') {
						count++;
						ch[j]=visit;
						fr[j]=visited;
					}
				}
				if(fr[i]!=visited)
				{
					fr[i]=count;
				}
				//if(ch[i]!='0')
					//System.out.println(ch[i]+" "+count);
				
			}
			for(int i=0;i<n;i++)
			{
				if(fr[i]!=visited&& ch[i]!=' ')
				{
					System.out.println(ch[i]+" | "+fr[i]);
				}
			}
		
	}

		
			

}


