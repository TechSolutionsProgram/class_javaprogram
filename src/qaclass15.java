
public class qaclass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = i++; //post increment j=i and Then i++ i+1
		
		System.out.println(i);//2
		System.out.println(j);// 1
		
		int m = 1;
		int n = ++m; //pre increment n=m+1 
		
		System.out.println(m);//
		System.out.println(n); //
		
		int p = 2;
		int q = p--; //post decrement q=p and then p-1
		
		System.out.println(p);//1
		System.out.println(q);//2
		
		int x = 2;
		int y = --x; //pre decrementy=x-1
		
		System.out.println(x);//
		System.out.println(y);//
		
		int g = -1;
		int h = g++;
		System.out.println(g);//1 g+1 0
		System.out.println(h);// -1
		
		
		int k = -5;
		int l = k--; //l=k and then k-1
		System.out.println(k);// -6 k-1 -5-1 
		System.out.println(l);// -5
		
		
		int c = -5;
		int d = --c;
		System.out.println(c);// -6 -5-1
		System.out.println(d);// -6
	}

}
