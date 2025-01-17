import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		StringBuilder sb = new StringBuilder(2 * k);
		for (int i = 0; i < k; i++) {
			sb.append('1');
		}
		for (int i = 0; i < k - 1; i++) {
			sb.append('0');
		}
		System.out.println(sb.toString());
		
		sc.close();
	}

}