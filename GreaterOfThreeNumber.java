package Practice;
import java.util.Scanner;
public class GreaterOfThreeNumber {

	public static void main(String[] args) {
//		int a=20, b=30, c=40;
		
		int a,b,c;
		System.out.println("Enter the Three Number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.print("The Greates Value is : ");
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);		
		}
		else
		{
			if(b>c)
				System.out.println(a);
			else
				System.out.println(c);	
		}
		

	}
}
