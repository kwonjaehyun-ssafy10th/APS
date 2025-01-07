import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int M = sc.nextInt(), P = sc.nextInt(), L = sc.nextInt(), E = sc.nextInt(), R = sc.nextInt(), S = sc.nextInt(), N = sc.nextInt();
			int n = 0;
			while (n < N) {
				int l = M * E;
				int p = L / R;
				int m = P / S;
				M = m;
				P = p;
				L = l;
				n++;
			}
			System.out.println(M);
		}
		
		sc.close();
	}

}