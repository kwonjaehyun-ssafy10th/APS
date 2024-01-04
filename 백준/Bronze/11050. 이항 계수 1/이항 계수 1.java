import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(binomial(N, K));
		
		sc.close();
	}
	
	static int binomial(int N, int K) {
		if (N == 1 || K == 0 || N == K) {
			return 1;
		} else {
			return binomial(N - 1, K) + binomial(N - 1,  K - 1);
		}
	}

}