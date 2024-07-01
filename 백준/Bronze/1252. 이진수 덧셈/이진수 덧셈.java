import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next(), b = sc.next();
		int d, l;
		int aLength = a.length(), bLength = b.length();
		if (aLength <= bLength) {
			d = bLength - aLength;
			l = bLength;
			for (int i = 0; i <= d; i++) {
				a = '0' + a;
			}
			b = '0' + b;
		} else {
			d = aLength - bLength;
			l = aLength;
			for (int i = 0; i <= d; i++) {
				b = '0' + b;
			}
			a = '0' + a;
		}
		String ans = "";
		int digit = 0;
		for (int i = l; 0 <= i; i--) {
			int temp = (a.charAt(i) - '0') + (b.charAt(i) - '0') + digit;
			if (temp == 0) {
				ans = '0' + ans;
				digit = 0;
			} else if (temp == 1) {
				ans = '1' + ans;
				digit = 0;
			} else if (temp == 2) {
				ans = '0' + ans;
				digit = 1;
			} else {
				ans = '1' + ans;
				digit = 1;
			}
		}
		while (1 < ans.length() && ans.charAt(0) == '0') ans = ans.substring(1); 
		System.out.println(ans);
		
		sc.close();
	}

}