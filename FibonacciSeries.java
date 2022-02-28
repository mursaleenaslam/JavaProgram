package Practice;

import java.util.Scanner;

	public class FibonacciSeries
{
	public static void main(String[] args) 
	{
	int n1=0, n2=1, n3, num;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many number you have print");
	num = sc.nextInt();
	System.out.print(n1+ " " +n2);
	
		for(int i=2; i<num; i++) 
		{ 
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
			System.out.print(" " +n3);
		}
	}
	

}
