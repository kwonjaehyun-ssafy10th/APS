import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for (int n = N; 1 <= n; n--) {
			int cnt = arr[n - 1];
			int idx = 0;
			for (int i = 0; i < list.size(); i++) {
				if (cnt <= idx) break;
				int num = list.get(i);
				if (n < num) idx++;
			}
			list.add(idx, n);
		}
		for (int n = 0; n < N; n++) {
			System.out.print(list.get(n) + " ");
		}
		
		sc.close();
	}

}