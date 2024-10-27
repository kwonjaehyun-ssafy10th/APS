import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			sum += num;
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num,  1);
			}
		}
		int freq = 0;
		int mode = 0;
		for (int key:map.keySet()) {
			if (freq < map.get(key)) {
				freq = map.get(key);
				mode = key;
			}
		}
		System.out.println(sum / 10);
		System.out.println(mode);
		
		sc.close();
	}

}