import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int U = sc.nextInt(), N = sc.nextInt();
		int[] arr = new int[U + 1];
		Map<Integer, String> map = new HashMap<>();
		for (int n = 0; n < N; n++) {
			String name = sc.next();
			int price = sc.nextInt();
			if (!map.containsKey(price)) {
				map.put(price, name);
			}
			arr[price]++;
		}
		int min = N;
		int idx = 0;
		for (int u = 1; u < U + 1; u++) {
			if (arr[u] < min && arr[u] != 0) {
				min = arr[u];
				idx = u;
			}
		}
		System.out.println(map.get(idx) + " " + idx);
		
		sc.close();
	}

}