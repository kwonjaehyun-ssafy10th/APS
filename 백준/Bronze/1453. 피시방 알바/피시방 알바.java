import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean[] check = new boolean[100];
		int ans = 0;
		for (int n = 0; n < N; n++) {
			int s = sc.nextInt();
			if (!check[s - 1]) check[s - 1] = true;
			else ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}