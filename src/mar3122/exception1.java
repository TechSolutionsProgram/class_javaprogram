package mar3122;

public class exception1 {

	
	//program is to divide the number by zero 10/0 -error/infinite number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doStuff();
	}
	public static void doStuff(){
	doMoreStuff();
	}
	public static void doMoreStuff(){
	System.out.println(10/0);
	}

}


