import java.util.Scanner;

public class qaclass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int marks;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		//ifelse
		/*in the school <50 ->E grade
marks>=50 and <60->D
marks>=60 and <70 ->C
marks>=70 and<80 ->B
marks>=80 and <100->A
else ->invalid marks*/
		
		if(num<50)
		{
			System.out.println("Marks -E");
		}
		else if((num>=50)&&(num<60))
		{
			System.out.println("Marks -D");
		}
		else if((num>=60)&&(num<70))
		{
			System.out.println("Marks -C");
		}
		else if((num>=70)&&(num<80))
		{
			System.out.println("Marks -B");
		}
		else if((num>=80)&&(num<100))
		{
			System.out.println("Marks -A");
		}
		else
		{			
			System.out.println("Invalid number");
		}

	}

}
