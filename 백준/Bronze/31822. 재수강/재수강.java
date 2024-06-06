import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original = sc.next();
		int N = sc.nextInt();
		int ans = 0;
		for (int n = 0; n < N; n++) {
			String retake = sc.next();
			boolean flag = true;
			for (int i = 0; i < 5; i++) {
				if (original.charAt(i) != retake.charAt(i)) {
					flag = false;
					break;
				}
			}
			if (flag) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}