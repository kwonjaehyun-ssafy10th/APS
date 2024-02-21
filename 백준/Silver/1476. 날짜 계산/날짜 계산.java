import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt(), S = sc.nextInt(), M = sc.nextInt();
		int i = 1, j = 1, k = 1;
		int y = 1;
		while (true) {
			if (E == i && S == j && M == k) break;
			i++; j++; k++; y++;
			if (i == 16) i = 1;
			if (j == 29) j = 1;
			if (k == 20) k = 1;
		}
		System.out.println(y);
		
		sc.close();
	}

}