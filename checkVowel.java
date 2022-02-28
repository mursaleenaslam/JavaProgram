package Practice;

import java.util.Scanner;

public class checkVowel {
	
	public static void main(String[] args) {
		char ch;
		System.out.print("Enter any character ");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
	
	}

}
