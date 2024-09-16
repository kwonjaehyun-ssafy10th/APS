import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		String s = sc.next();
		int l = s.length();
		int r = l / K;
		char[][] map = new char[r][K];
		for (int i = 0; i < l; i++) {
			if (i / K % 2 == 0) {
				map[i / K][i % K] = s.charAt(i);
			} else {
				map[i / K][K - (i % K) - 1] = s.charAt(i);
			}
		}
		String ans = "";
		for (int j = 0; j < K; j++) {
			for (int i = 0; i < r; i++) {
				ans += map[i][j];
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}