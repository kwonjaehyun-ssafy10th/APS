import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		st = new StringTokenizer(str);
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		int M = Integer.parseInt(br.readLine());
		str = br.readLine();
		st = new StringTokenizer(str);
		for (int m = 0; m < M; m++) {
			bw.write(String.valueOf(binarySearch(list,  Integer.parseInt(st.nextToken()))));
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int binarySearch(List<Integer> list, int num) {
		int start = 0;
		int end = list.size() - 1;
		boolean flag = false;
		while (true) {
			int mid = (start + end) / 2;
			int target = list.get(mid);
			if (target == num) {
				flag = true;
				break;
			} else {
				if (target < num) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			if (end < start) break;
		}
		if (flag) return 1;
		return 0;
	}

}