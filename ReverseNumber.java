package Practice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main (String[] args)
	{
//		int n, reminder, reverse=0;
//		System.out.println("Enter the Number");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		for (int i=n; i>0; i=i/10)
//		{
//			reminder = i%10;
//			reverse = reverse*10+reminder;
//		}
//		System.out.println(reverse+ " is a Reverse of " +n);
		
		
//	System.out.println("Enter the any no.");
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
////	
//		int rev = 0;
//	
//	while(num!=0) {
//		
//		rev = rev*10 + num%10;
//		num = num/10;
//	}
//	System.out.println("Reverse Number is : " +rev);
		
		
		
		System.out.println("Enter The Number");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
//		StringBuffer sb=new StringBuffer(String.valueOf(Num));
//		StringBuffer rev = sb.reverse();	
//		System.out.println("Reverse Number is : " +rev);
		
		
		
		StringBuilder sb=new StringBuilder();
		sb.append(Num);
		StringBuilder rev= sb.reverse();
		System.out.println(" " +rev);
	}
}
