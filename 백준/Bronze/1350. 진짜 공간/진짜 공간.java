import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] file = new int[N];
		for (int n = 0; n < N; n++) {
			file[n] = sc.nextInt();
		}
		int cluster = sc.nextInt();
		long cnt = 0;
		for (int n = 0; n < N; n++) {
			cnt += (long) ((file[n] + cluster - 1) / cluster);
		}
		System.out.println((long) cnt * (long) cluster);
		
		sc.close();
	}

}