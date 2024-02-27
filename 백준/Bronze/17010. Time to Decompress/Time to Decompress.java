import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		for (int l = 0; l < L; l++) {
			int N = sc.nextInt();
			String x = sc.next();
			String ans = "";
			for (int n = 0; n < N; n++) {
				ans += x;
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}