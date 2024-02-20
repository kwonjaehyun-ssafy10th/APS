import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String X = sc.next();
		int cnt = 0;
		while (1 < X.length()) {
			int sum = 0;
			for (int i = 0; i < X.length(); i++) {
				sum += X.charAt(i) - '0';
			}
			X = String.valueOf(sum);
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(Integer.valueOf(X) % 3 == 0 ? "YES" : "NO");
		
		sc.close();
	}

}