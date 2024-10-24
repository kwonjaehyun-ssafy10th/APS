import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String seats = sc.next();
		int ans = 0;
		int n = 0;
		while (n < N) {
			if (seats.charAt(n) == 'L') n++;
			n++;
			ans++;
		}
		System.out.println(Math.min(ans + 1, N));
		
		sc.close();
	}

}