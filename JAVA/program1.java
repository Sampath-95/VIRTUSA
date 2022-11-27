import java.util.Scanner;
public class program1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		int temp=a;
		a=b;
		b=temp;
		System.out.print("first number is- ");
		
		System.out.println(a);
		System.out.print("second number is- ");
		System.out.println(b);
	}

}
