package Practice;

public class CountNum {

	public static void main(String[] args) {
		
//		int n = 1283848468;
//		int count = 0;
//		while(n > 0) {
//			int rem = n%10;
//			if(rem == 8) {
//				count++;
//			}
//			n = n/10;
//		}
//		System.out.println(count);
		
		int num = 123456;
		int ans = 0;
		while(num > 0) {
			int rem = num%10;
			num = num/10;
			ans = ans *10 + rem;
		}	
		System.out.println(ans);
	}
}
