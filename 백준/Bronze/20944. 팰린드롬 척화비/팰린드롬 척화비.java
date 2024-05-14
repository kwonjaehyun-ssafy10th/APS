import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			sb.append('a');
		}
		System.out.println(sb);
		
		sc.close();
	}

}