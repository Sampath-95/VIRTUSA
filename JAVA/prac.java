import java.util.Scanner;

public class prac {
	static void methods(int a,int b) {
		System.out.println("This is module 1\nThis performs Multiplication Operation");
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		methods(a,b);
	}

}
