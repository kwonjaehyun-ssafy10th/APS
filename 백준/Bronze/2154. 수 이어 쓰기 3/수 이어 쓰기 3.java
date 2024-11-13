import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		for (int n = 1; n <= N; n++) {
			sb.append(String.valueOf(n));
		}
		String str = sb.toString();
		int idx = str.indexOf(String.valueOf(N)) + 1;
		System.out.println(idx);
	}

}