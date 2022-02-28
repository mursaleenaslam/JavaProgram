package Practice;
import java.util.Scanner;
public class SwapNumber_WithOutThirdVariable {

	public static void main(String[] args) {
		int n, m;
		System.out.println("Enter the First Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter the Second Number");
		Scanner sn = new Scanner(System.in);
		m = sn.nextInt();
		
		System.out.println("Before Swapping the Number");
		System.out.println("N = " +n);
		System.out.println("M = " +m);
		
		n = m+n;
		m = n-m;
		n = n-m;
		
		System.out.println("After Swapping the Number");
		System.out.println("N = " +n);
		System.out.println("M = " +m);


	}

}
