
public class arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declare an array and initialize
		
	//	int a[] = {1,2,3};
	//	a[]= {1,2,3,4,5};
	//	System.out.println(a[1]);
		
	//	a[5]=2;
		
		//declare an array with 6 elements {1,2,3,4,5,3} and try to assign b[5]=10.Display the 6th element
		
		int b[]= {1,2,3,4,5,3};
		System.out.println("Before assigning:"+b[5]);
		b[5]=10;
		System.out.println("After assigning :"+b[5]);
		
		int c=b[2]+b[3];
		
		System.out.println("Sum of 2 number:"+ c);
		System.out.println("Sum of 2 number:"+ b[2]+b[3]);
		
		
		//Declare the 2 dimension array
		
		int r[][]= {{2,3},{4,5},{3,6}};
		
		System.out.println(r[2][1]);
		
		

	}

}
