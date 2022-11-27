import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-");
		int x=sc.nextInt();
		int b=0;
		int c=1;
		System.out.println("Fibonacci Series is");
		System.out.println(b);
		System.out.println(c);
		for(int i=1;i<=x;i++) {
			int fib=c+b;
			System.out.println(fib);
			b=c;
			c=fib;
		}
		
	}

}
