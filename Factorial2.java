package Practice;

import java.util.Scanner;

public class Factorial2 {
	
	public static void main(String[] agrs) {
		
		int fact = 0, num;
		System.out.println("Enter the Number");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<num;i++) {
			fact = num*i;
		}
		System.out.println(fact);
	}

}
