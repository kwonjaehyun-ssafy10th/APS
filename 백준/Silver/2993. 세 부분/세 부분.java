import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String ans = a;
		int l = a.length();
		for (int i = 1; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				String temp = "";
				for (int k = i - 1; 0 <= k; k--) {
					temp += a.charAt(k);
				}
				for (int k = j - 1; i <= k; k--) {
					temp += a.charAt(k);
				}
				for (int k = l - 1; j <= k; k--) {
					temp += a.charAt(k);
				}
				if (temp.compareTo(ans) < 0) {
					ans = temp;
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}