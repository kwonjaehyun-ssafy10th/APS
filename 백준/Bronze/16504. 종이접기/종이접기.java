import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long ans = 0L;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				ans += sc.nextLong();
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}