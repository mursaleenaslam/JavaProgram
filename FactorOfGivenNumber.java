package Practice;
import java.util.Scanner;

public class FactorOfGivenNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
		System.out.println("=> " + i);
			}
		}
	}
}

