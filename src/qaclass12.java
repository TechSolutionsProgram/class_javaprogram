import java.util.Scanner;

public class qaclass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check the number is odd or even
		
		//int num=73;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
