import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), Q = sc.nextInt();
		boolean[] arr = new boolean[N];
		for (int q = 0; q < Q; q++) {
			int L = sc.nextInt(), I = sc.nextInt();
			for (int i = L - 1; i < N; i = i + I) {
				arr[i] = true;
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (!arr[i]) ans++; 
		}
		System.out.println(ans);
		
		sc.close();
	}

}