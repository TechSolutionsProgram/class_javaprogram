package Javaintpractise;

public class stringoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiple occurance of the character
		String str="Is it your first company";
		str=str.toLowerCase();
		Occuringchar(str);
		
	}

	private static void Occuringchar(String str) {
		// TODO Auto-generated method stub
		//create an array of string size
		int count[]=new int[256];
		
		int len=str.length();
		
		// Initialize count array index
       for (int i = 0; i < len; i++)
        {
    	   //count[str.charAt(i)]++;
            System.out.println( str.charAt(i) +" | "+count[str.charAt(i)]++);
        }
        
     // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j] && str.charAt(i)!=' ')
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "Number of Occurrence of "
                    + str.charAt(i)
                    + " is:" + count[str.charAt(i)]);
            
            if(count[str.charAt(i)]==1&& str.charAt(i)!=' ')
            {	System.out.println("single occurrence: "+str.charAt(i));
            	break;
            }
            
        }
        
		
	}
}
