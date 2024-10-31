import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Long> dp = new ArrayList<>(Arrays.asList((long)1, (long)1, (long)1, (long)2, (long)2));
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			for (int n = dp.size(); n < N; n++) {
				dp.add(dp.get(n - 1) + dp.get(n - 5));
			}
			System.out.println(dp.get(N - 1));
		}
		
		sc.close();
	}

}