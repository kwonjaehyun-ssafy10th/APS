import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			if (k == 1) {
				for (int j = l - 1; j < r; j++) {
					arr[j] = arr[j] * arr[j] % 2010;
				}
			} else {
				int sum = 0;
				for (int j = l - 1; j < r; j++) {
					sum += arr[j];
				}
				bw.write(String.valueOf(sum));
				bw.newLine();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}