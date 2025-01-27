import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		String ans = "";
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'I') ans += 'i';
			else ans += 'L';
		}
		System.out.println(ans);
		
		sc.close();
	}

}