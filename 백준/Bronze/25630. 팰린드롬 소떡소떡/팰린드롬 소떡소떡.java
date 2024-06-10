import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String a = sc.next();
		int ans = 0;
		for (int i = 0; i < N / 2; i++) {
			if (a.charAt(i) != a.charAt(N - 1 - i)) {
				ans++;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}