import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(sc.nextInt());
		}
		int ans = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int num = list.get(i) + list.get(j) + list.get(k);
					if (ans < num && num <= M) {
						ans = num;
					}
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}