import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
		String str = sc.next();
		for (int n = 0; n < N; n++) {
			ans += Integer.valueOf(str.charAt(n)) - 48;
		}
		System.out.println(ans);
		
		sc.close();
	}

}