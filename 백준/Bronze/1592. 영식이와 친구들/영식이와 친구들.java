import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt(), L = sc.nextInt();
		int[] arr = new int[N];
		arr[0] = 1;
		int i = 0;
		int ans = 0;
		while (true) {
			if (arr[i] == M) break;
			if (arr[i] % 2 == 1) {
				i = (i + L) % N;
			} else {
				i = (i - L) % N;
				if (i < 0) i += N;
			}
			arr[i]++;
			ans++;
		}
		System.out.println(ans);
		
		sc.close();
	}

}