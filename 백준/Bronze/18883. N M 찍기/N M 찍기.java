import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt(), M = sc.nextInt();
		for (int n = 0; n < N; n++) {
			sb.append(n * M + 1);
			for (int m = 2; m <= M; m++) {
				sb.append(" ").append(n * M + m);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		sc.close();
	}

}