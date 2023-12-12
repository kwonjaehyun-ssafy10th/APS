import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String str = sc.next();
			int ans = 0;
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					cnt++;
					ans += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(ans);
			
		}
		
		sc.close();
	}

}