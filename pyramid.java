package test;

public class pyramid {

	static int printOdd(int n, int no) {
		
		int x=no+1;
		
		for(int i=1;i<=n-1;i++) {
			System.out.print(x+"*");
			x++;
		}
		System.out.print(x);
		System.out.println();
		return no+n;
		
	}
 static	int printEven(int n,int no) {
	 int x;
	
	  x=no+n;
		for(int i=1;i<=n-1;i++) {
			System.out.print(x+"*");
			x--;
		}
		System.out.print(x);
		System.out.println();
		return no+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=7,no=1;
 if(n==1)
	 System.out.println(n);
 else {
	 System.out.println(1);
 for(int i=2;i<=n;i++)
 {
	 
	 if(i%2!=0) {
		 
		no = printOdd(i,no);
		 
	 }
	 else
	 {
		
		no =printEven(i,no); 
	 }
 }
 }
	}

}
