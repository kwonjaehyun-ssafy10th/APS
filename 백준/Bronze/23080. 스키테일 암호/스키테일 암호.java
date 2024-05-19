import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		String S = sc.next();
		String ans = "";
		int i = 0;
		while (K * i < S.length()) {
			ans += S.charAt(K * i++);
		}
		System.out.println(ans);
		
		sc.close();
	}

}