import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt(), M = sc.nextInt();
		long ans;
		if (N >= M) ans = N - M;
		else ans = M - N;
		System.out.println(ans);
		
		sc.close();
	}

}