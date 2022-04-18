
public class qaclass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
	    // Enhanced for loop, this will automatically iterate on the array list 
	    for (String dayName : days) {
	      System.out.println("Days ==> "+ dayName);
	      if(dayName=="Thr") {
	    	  System.out.println("continuestatement");
	    	  continue;
	        }
	      
	    	}

	}

}
