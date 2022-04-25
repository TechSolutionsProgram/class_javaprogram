package Javaintpractise;

public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count the vowels
		
		String str="abraceiouedhtlv";
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		int count=0,cons=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				count++;
			else
				cons++;
		}
		System.out.println("Vowel count:"+count+"\n"+"Consonant count:"+cons);
				
	}

}
