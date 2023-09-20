package 선_긋기_2170;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int n = 0; n < N; n++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			arr[n][0] = Integer.parseInt(st.nextToken());
			arr[n][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] arr1, int[] arr2) {
				return Integer.compare(arr1[0], arr2[0]);
			}
		});
		
		int ans = 0;
		int start = arr[0][0], end = arr[0][1];
		for (int n = 1; n < N; n++) {
			if (end < arr[n][0]) {
				ans += end - start;
				start = arr[n][0];
				end = arr[n][1];
			} else if (end <= arr[n][1]) {
				end = arr[n][1];
			}
		}
		ans += end - start;
		
		bw.write(Integer.toString(ans));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
