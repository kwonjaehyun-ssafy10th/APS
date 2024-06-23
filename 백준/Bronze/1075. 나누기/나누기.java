import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int F = sc.nextInt();
		int n = N / 100 * 100;
		for (int i = n; i < n + 100; i++) {
			if (i % F == 0) {
				String num = String.valueOf(i);
				int length = num.length();
				String ans = num.substring(length - 2);
				System.out.println(ans);
				break;
			}
		}
		
		sc.close();
	}

}