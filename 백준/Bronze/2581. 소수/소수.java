import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] p = new boolean[N + 1];
		Arrays.fill(p, true);
		for (int i = 2; i < (int) Math.sqrt((double) N) + 1; i++) {
			if (p[i]) {
				int j = 2;
				while (i * j <= N) {
					p[i * j++] = false;
				}	
			}
		}
		p[0] = false;
		p[1] = false;
		int sum = 0;
		int min = 0;
		boolean flag = true;
		for (int i = M; i <= N; i++) {
			if (p[i]) {
				sum += i;
				if (flag) {
					min = i;
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}

}