import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt(), M = sc.nextInt();
		int stress = 0, ans = 0;
		for (int n = 0; n < N; n++) {
			int A = sc.nextInt();
			if (0 <= stress + A) stress += A;
			else stress = 0;
			if (M <= stress) ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}