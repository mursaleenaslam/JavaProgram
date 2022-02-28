package Practice;

import java.util.Scanner;

public class SumOFOddEven {

	public static void main(String[] args) {
	
		int a,i,sum=0;
		System.out.print("Enter the Range");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
	
		if(a % 2 ==0)
		{
			for(i=0; i<=a; i=i+2)
			{
				sum = sum+i;
			}
		}
		else
		{
			for(i = 1; i<=a; i=i+2)
				
			{
				sum = sum+i;
			}
			System.out.print("Sum of the Odd Number : " +sum);	
		}
		System.out.print("Sum of Even Number : " +sum);	
	}
}
