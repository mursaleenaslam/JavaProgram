package Practice;

import java.util.Scanner;

public class charInputUser {

	public static void main(String[] args) {
		char ch;
		System.out.print("Please Enter the Character ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
	
		System.out.print(ch);

	}

}
