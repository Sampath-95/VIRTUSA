import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-");
		int a=sc.nextInt();
		int rev=0;
		int i;
		while(a!=0) {
			i=a%10;
			rev=(rev*10)+i;
			a/=10;
		}
		System.out.println("After Reversing the Given Number");
		System.out.println(rev);
	}
}
