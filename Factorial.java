package Practice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] agrs) {
		
		int fact=1, num;
		System.out.println("Enter the Number");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
