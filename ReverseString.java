package Practice;
//
import java.util.Scanner;
//
public class ReverseString {

	// 1. Using taking inputs from KeyBoard 
//	public static void main(String[] args)
//	{
//		String result = " ";
//		System.out.print(" Enter the String : ");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		char ch[] = str.toCharArray();
//		
//		for(int i=ch.length-1; i>=0; i--)
//		{
//		    result += ch[i];
//		}
//	       	System.out.println("Reverse String is : " +result);
//	}
//}
	// 2. Using taking inputs from KeyBoard with StringBuffer
//		
//		public static void main(String[] args){
//		String result = "";
//		System.out.println("Write Your String");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		StringBuffer st = new StringBuffer();
//		st.append(str);
//		st.reverse();
//		System.out.println("Reverse String is : " +st);
	
	// 3. Using + (string concatenation) operator 
	
	public static void main(String[] args){	
		String str = "ABCDEF";
		String rev = "";
//		
//		int len = str.length();
//		
//		for(int i=len-1; i>=0; i--) {
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
	// 4. using Charcater array
//		char a[] = str.toCharArray();
//		
//		for(int i=str.length()-1; i>=0; i-- )
//		{
//			rev = rev+a[i];
//			
//		}
//		System.out.println(rev);
		
	// 5. Using StringBuffer Class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
