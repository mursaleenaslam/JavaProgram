package Practice;

import java.util.Scanner;

public class PrintEvenNo {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Term");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i<=n; i=i+2)
		{
			System.out.print(i + " ");
		}
	}

}
