import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-");
		int a=sc.nextInt();
		int sum=0;
		int i;
		while(a!=0) {
			i=a%10;
			sum+=i;
			a/=10;
		}
		System.out.println("sum of digits are");
		System.out.println(sum);
	}

}
