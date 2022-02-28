package Practice;
import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		int n, p, result = 1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the power");
		p = sc.nextInt();
		for(int i=1; i<=p; i++)
		{
			result = result*n;
		}
		System.out.println("The value of n to the power of p is : " +result);

	}
}
