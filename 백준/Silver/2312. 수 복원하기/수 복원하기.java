import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int M = N;
			int[] arr = new int[N + 1];
			int num = 2;
			while (true) {
				if (M == 1) break;
				if (M % num != 0) {
					num++;
				} else {
					M /= num;
					arr[num]++;
				}
			}
			for (int n = 0; n < N + 1; n++) {
				if (arr[n] != 0) {
					System.out.println(n + " " + arr[n]);
				}
			}
		}
		
		sc.close();
	}

}