import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int i = 0, s = 0;
			while (s < N) {
				i++;
				s += i;
			}
			int m = N - s + i;
			int n = 0;
			int d = 0;
			if (i % 2 == 1) {
				n = i - m + 1;
				d = m;
			} else {
				n = m;
				d = i - m + 1;
			}
			System.out.println(String.format("TERM %d IS %d/%d", N, n, d));
		}
		
		sc.close();
	}

}