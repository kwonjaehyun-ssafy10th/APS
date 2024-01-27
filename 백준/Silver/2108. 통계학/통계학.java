import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int[] arr = new int[N];
		int maxNum = -4001;
		int minNum = 4001;
		Map<Integer, Integer> map = new HashMap<>();
		for (int n = 0; n < N; n++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[n] = num;
			if (num < minNum) minNum = num;
			if (maxNum < num) maxNum = num;
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		int modeCnt = 0;
		for (int n: map.values()) {
			if (modeCnt < n) modeCnt = n;
		}
		List<Integer> list = new ArrayList<>();
		for (int n: map.keySet()) {
			if (map.get(n) == modeCnt) list.add(n);
		}

		Arrays.sort(arr);
		System.out.println(Math.round((float)sum /(float) N));
		System.out.println(arr[N / 2]);
		if (list.size() == 1) {
			System.out.println(list.get(0));
		} else {
			Collections.sort(list);
			System.out.println(list.get(1));
		}
		System.out.println(maxNum - minNum);
		
		br.close();
	}

}