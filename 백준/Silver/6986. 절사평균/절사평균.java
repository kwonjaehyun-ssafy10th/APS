import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		List<Double> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(Double.parseDouble(br.readLine()));
		}
		list.sort(null);
		double ans1, ans2;
		double sum = 0.0;
		for (int n = K; n < N - K; n++) {
			sum += list.get(n);
		}
		ans1 = sum / (N - 2 * K) + 1e-8;
		for (int n = 0; n < K; n++) {
			sum += list.get(K);
			sum += list.get(N - K - 1);
		}
		ans2 = sum / N + 1e-8;
		
		System.out.println(String.format("%.2f", ans1));
		System.out.println(String.format("%.2f", ans2));
		
		br.close();
	}

}