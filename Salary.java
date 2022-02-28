package Practice;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		int salary; 
		System.out.println("Enter The Amount");
		Scanner sl= new Scanner(System.in);
		salary =sl.nextInt();
		
		
		if (salary>10000)
		{
			salary=salary+1000;
			System.out.println("Salary :"  +salary);
			
		} 
		else {
			salary=salary+500;
			System.out.println("Salary :"  +salary);
		}
	}
	

}
