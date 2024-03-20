import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list, Collections.reverseOrder());
		int ans = -1;
		for (int n = 0; n < N - 2; n++) {
			int a = list.get(n);
			int b = list.get(n + 1);
			int c = list.get(n + 2);
			if (a < b + c) {
				ans = a + b + c;
				break;
			}
		}
		System.out.println(ans);
		
		br.close();
	}

}