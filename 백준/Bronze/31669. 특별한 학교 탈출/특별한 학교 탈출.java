import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		char[][] graph = new char[N][M];
		for (int n = 0; n < N; n++) {
			String line = sc.next();
			for (int m = 0; m < M; m++) {
				graph[n][m] = line.charAt(m);
			}
		}
		boolean flag;
		String ans = "ESCAPE FAILED";
		for (int m = 0; m < M; m++) {
			flag = true;
			for (int n = 0; n < N; n++) {
				if (graph[n][m] == 'O') {
					flag = false;
					break;
				}
			}
			if (flag) {
				ans = String.valueOf(m + 1);
				break;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}