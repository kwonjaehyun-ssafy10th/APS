import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> balls = new ArrayList<>();
		int b = 0;
		int i = 1;
		while (b < N) {
			b += i * (i + 1) / 2;
			balls.add(b);
			i++;
		}
		int[] dp = new int[N + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		for (int n = 1; n <= N; n++) {
			for (int ball: balls) {
				if (n <= ball) {
					if (n == ball) {
						dp[n] = 1;
					}
					break;
				}	
				dp[n] = Math.min(dp[n], dp[n - ball] + 1);
			}
		}
		System.out.println(dp[N]);
		
		sc.close();
	}

}