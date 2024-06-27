import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), m = sc.nextInt(), M = sc.nextInt(), T = sc.nextInt(), R = sc.nextInt();
		int t = 0;
		int s = 0;
		int p = m;
		while (true) {
			if (t == N) break;
			if (M < m + T) {
				s = -1;
				break;
			}
			if (M < p + T) {
				p = Math.max(m, p - R);
			} else {
				p += T;
				t++;
			}
			s++;
		}
		System.out.println(s);
		
		sc.close();
	}

}