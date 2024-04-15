import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long ans = 0L;
		for (long i = 1L; i < N; i++) {
			ans += i * N + i;
		}
		System.out.println(ans);
		
		sc.close();
	}

}