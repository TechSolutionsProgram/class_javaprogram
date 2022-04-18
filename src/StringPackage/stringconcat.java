package StringPackage;

public class stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		   
		   
		   String s1="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);
		   
		   StringBuilder s4 = new StringBuilder("Hello");    //String 1  
	        StringBuilder s5 = new StringBuilder(" World");    //String 2  
	        StringBuilder s6 = s4.append(s5);   //String 3 to store the result  
	            System.out.println(s6.toString());  //Displays result  
	}

}
