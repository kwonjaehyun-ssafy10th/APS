import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] c1 = new int[101];
		int[] p1 = { 500, 300, 200, 50, 30, 10 };
		int[] c2 = new int[65];
		int[] p2 = { 512, 256, 128, 64, 32 };
		
		int i = 1;
		int j = 0;
		int idx = 1;
		boolean flag = false;
		while (true) {
			for (int k = 0; k < i; k++) {
				if (21 < idx) {
					flag = true;
					break;
				}
				c1[idx++] = p1[j];
			}
			if (flag) break;
			i++;
			j++;
		}
		
		j = 0;
		idx = 1;
		flag = false;
		int n = 1;
		while (true) {
			for (int k = 0; k < n; k++) {
				if (31 < idx) {
					flag = true;
					break;
				}
				c2[idx++] = p2[j];
			}
			if (flag) break;
			i++;
			j++;
			n *= 2;
		}
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println((c1[a] + c2[b]) * 10000);
		}
		
		sc.close();
	}

}