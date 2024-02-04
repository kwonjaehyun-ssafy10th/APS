import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] line = new int[K];
		long max = 0;
		for (int k = 0; k < K; k++) {
			line[k] = Integer.parseInt(br.readLine());
			if (max < line[k]) {
				max = line[k];
			}
		}
		System.out.println(binarySearch(K, N, line, max));
		
		br.close();
	}
	
	static int binarySearch(int K, int N, int[] line, long max) {
		long start = 1;
		long end = max;
		long mid = (start + end) / 2;
		while (start < end) {
			int cnt = 0;
			for (int k = 0; k < K; k++) {
				cnt += line[k] / mid;
			}
			if (cnt < N) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		
		int sum = 0;
		for (int k = 0; k < K; k++) {
			sum += line[k] / start;
		}
		if (sum < N) return (int) start - 1;
		return (int) start;
	}

}