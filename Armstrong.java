package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		
		int num, digit=0, rem=0, armg=0;
		System.out.println("Enter the Value");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int temp=num;
			while(temp>0)
			{
				temp=temp/10;
				digit++;
			}
		temp=num;
		while(temp>0)
		{
			rem = temp % 10;
			armg = (armg +  (int)(Math.pow(rem, digit)));
			temp = temp/10;

		}
		if(num==armg)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");

		}	
}
