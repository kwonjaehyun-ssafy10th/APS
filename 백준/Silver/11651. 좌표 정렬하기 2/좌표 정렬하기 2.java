import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[2];
			for (int i = 0; i < 2; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			list.add(arr);
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				if (a1[1] != a2[1]) {
					return Integer.compare(a1[1], a2[1]);
				}
				return Integer.compare(a1[0], a2[0]);
			}
		});
		
		for (int n = 0; n < N; n++) {
			int[] arr = list.get(n);
			for (int i = 0; i < 2; i++) {
				bw.write(String.valueOf(arr[i]) + " ");
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}