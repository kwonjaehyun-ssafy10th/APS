import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(), K = sc.nextInt(), P = sc.nextInt();
		int ans = 0;
		for (int n = 1; n <= C; n++) {
			ans += n * (K + P * n);
		}
		System.out.println(ans);
		
		sc.close();
	}

}