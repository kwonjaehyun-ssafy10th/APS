import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int l = N.length();
		int n = Integer.parseInt(N);
		int i = 0;
		while (i < l - 1) {
			if (5 <= n % 10) {
				n += 10 - n % 10;
			}
			n /= 10;
			i++;
		}
		System.out.println(n * (int) Math.pow(10, l - 1));
		
		sc.close();
	}

}