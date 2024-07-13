import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = 1;
		int t = 0;
		while (0 < N) {
			if (N < K) K = 1;
			N -= K++;
			t++;
		}
		System.out.println(t);
		
		sc.close();
	}

}