package Practice;

import java.util.Scanner;

public class PrintOddNo {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the Term");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for(int i=1; i<=a; i= i+2)
		{
			System.out.print(i + " ");
		}

	}

}
