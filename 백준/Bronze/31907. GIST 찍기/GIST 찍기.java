import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int K = sc.nextInt();
		for (int k = 0; k < K; k++) {
			for (int i = 0; i < K; i++) {
				sb.append('G');
			}
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < 3; j++) {
					sb.append('.');
				}
			}
			sb.append('\n');
		}
		for (int k = 0; k < K; k++) {
			for (int i = 0; i < K; i++) {
				sb.append('.');
			}
			for (int i = 0; i < K; i++) {
				sb.append('I');
			}
			for (int i = 0; i < K; i++) {
				sb.append('.');
			}
			for (int i = 0; i < K; i++) {
				sb.append('T');
			}
			sb.append('\n');
		}
		for (int k = 0; k < K; k++) {
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < 2; j++) {
					sb.append('.');					
				}
			}
			for (int i = 0; i < K; i++) {
				sb.append('S');
			}
			for (int i = 0; i < K; i++) {
				sb.append('.');
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
		sc.close();
	}

}