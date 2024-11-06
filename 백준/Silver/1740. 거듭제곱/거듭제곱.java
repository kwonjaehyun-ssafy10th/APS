import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long N = sc.nextLong();
		String n = Long.toBinaryString(N);
		int l = n.length();
		Long ans = 0L;
		for (int i = 0; i < l; i++) {
			if (n.charAt(l - 1 - i) == '1') {
				long p = 1;
				for (int j = 0; j < i; j++) {
					p *= 3;
				}
				ans += p;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}