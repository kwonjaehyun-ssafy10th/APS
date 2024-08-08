import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Character> map1 = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				map1.put((char) (i * 3 + j + 65), (char) (i + 2 + '0'));
			}
		}
		for (int i = 0; i < 4; i++) {
			map1.put((char) (65 + 15 + i), (char) (7 + '0'));
		}
		for (int i = 0; i < 3; i++) {
			map1.put((char) (65 + 19 + i), (char) (8 + '0'));
		}
		for (int i = 0; i < 4; i++) {
			map1.put((char) (65 + 22 + i), (char) (9 + '0'));
		}
		Map<String, String> map2 = new HashMap<>();
		int M = sc.nextInt();
		for (int m = 0; m < M; m++) {
			String word = sc.next();
			String s = "";
			for (int i = 0; i < word.length(); i++) {
				s += map1.get(word.charAt(i));
			}
			if (!map2.containsKey(s)) {
				map2.put(s, word);
			}
		}
		String ans = "";
		int N = sc.nextInt();
		String w = "";
		for (int n = 0; n < N; n++) {
			char c = sc.next().charAt(0);
			if (c == '1') {
				if (map2.containsKey(w)) ans += map2.get(w);
				else {
					for (int i = 0; i < w.length(); i++) {
						ans += '*';
					}
				}
				ans += " ";
				w = "";
			} else {
				w += c;
			}
		}
		if (map2.containsKey(w)) ans += map2.get(w);
		else {
			for (int i = 0; i < w.length(); i++) {
				ans += '*';
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}