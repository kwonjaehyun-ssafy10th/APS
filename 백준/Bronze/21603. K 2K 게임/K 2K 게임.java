import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt(), K = sc.nextInt();
		int ans = 0;
		List<Integer> list = new ArrayList<>();
		for (int x = 1; x <= N; x++) {
			if (x % 10 != K % 10 && x % 10 != 2 * K % 10) {
				ans++;
				list.add(x);
			}
		}
		for (int i = 0; i < ans; i++) {
			sb.append(list.get(i) + " ");
		}
		System.out.println(ans);
		System.out.println(sb);
		
		sc.close();
	}

}