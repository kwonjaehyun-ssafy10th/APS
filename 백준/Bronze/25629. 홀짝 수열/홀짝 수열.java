import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int o = 0;
		int ans = 0;
		for (int n = 0; n < N; n++) {
			if (sc.nextInt() % 2 == 1) o++;
		}
		if ((N + 1) / 2 == o) ans = 1;
		System.out.println(ans);
		
		sc.close();
	}

}