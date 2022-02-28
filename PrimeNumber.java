package Practice;

import java.util.Scanner;

class PrimeNumber
{
	
	public static void main(String[] args)
	{
		int num,cond=2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vlaue");
		num = sc.nextInt();
		
		for(int i=2; i<=Math.sqrt(num); i++)
		{
			
			
			if(num%i==0)
			{
				cond = 1;
				System.out.println(num+ " is not prime number");
				break;
			}
		}
		if(cond==2)
		{
		System.out.println( num+ " this is prime number");
		}
	}
}