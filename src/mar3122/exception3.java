package mar3122;

import java.io.FileNotFoundException;

public class exception3 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Exception"+10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception in catch");
		}
		finally
		{
			System.out.println("final");
		}
		

	}

}
