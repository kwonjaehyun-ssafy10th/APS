import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = { '/', '-', '\\', '(', '@', '?', '>', '&', '%' };
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < 9; i++) {
			map.put(arr[i], i - 1);
		}
		
		while (true) {
			String s = sc.next();
			if (s.equals("#")) break;
			int ans = 0;
			int len = s.length();
			for (int i = 0; i < len ; i++) {
				ans += map.get(s.charAt(i)) * (int) Math.pow(8, len - i - 1);
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

}