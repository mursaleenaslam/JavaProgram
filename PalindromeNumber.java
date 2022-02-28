package Practice;

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		
//		int  n, reminder, reverse=0;
//		System.out.println("Enter the Number");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		for(int i=n; i>0; i=i/10)
//		{
//		reminder = i%10;
//		reverse = reverse*10+reminder;
//		}
//		if(reverse==n)
//		{
//			System.out.println(reverse + " is a Palindrome Numbeer");
//		}
//		else
//		{
//			System.out.println(reverse + " is not a Palindrome Number");
//		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		
		int org_num = num;
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_num == rev) {
			System.out.println("This is Palindrome number : " +org_num);
		}
		else {
			System.out.println("This is not Palindrome number : " +org_num);
		}
	}

}
