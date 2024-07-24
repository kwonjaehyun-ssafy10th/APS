import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		Map<Character, Integer> aMap = new HashMap<>();
		Map<Character, Integer> bMap = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (aMap.containsKey(c)) {
				aMap.put(c, aMap.get(c) + 1);
			} else {
				aMap.put(c, 1);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (bMap.containsKey(c)) {
				bMap.put(c, bMap.get(c) + 1);
			} else {
				bMap.put(c, 1);
			}
		}
		int ans = 0;
		for (char c: aMap.keySet()) {
			if (bMap.containsKey(c)) {
				ans += Math.abs(aMap.get(c) - bMap.get(c));
			} else {
				ans += aMap.get(c);
			}
		}
		for (char c: bMap.keySet()) {
			if (!aMap.containsKey(c)) ans += bMap.get(c);
		}
		System.out.println(ans);
		
		sc.close();
	}

}