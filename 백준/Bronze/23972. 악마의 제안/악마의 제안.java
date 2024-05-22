import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt(), N = sc.nextInt();
		long ans;
		if (N == 1) ans = -1;
		else {
			ans = (long) K * N / (N - 1);
			if ((K * N) % (N - 1) != 0) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}