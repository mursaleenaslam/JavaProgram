package Practice;

import java.util.Scanner;

public class GreaterOfTwoNumber 
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter the two values");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b)
		{
			
			System.out.println("The grater vlaue is : " +a);
		}
		else
		{
			System.out.println("The grater vlaue is : " +b);
		}
	}

}
