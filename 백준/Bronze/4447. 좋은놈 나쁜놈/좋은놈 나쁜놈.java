import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			Map<Character, Integer> map = new HashMap<>();
			map.put('B', 0);
			map.put('b', 0);
			map.put('G', 0);
			map.put('g', 0);
			for (int j = 0; j < name.length(); j++) {
				char c = name.charAt(j);
				if (map.containsKey(c)) map.put(c, map.get(c) + 1);
			}
			String ans = "NEUTRAL";
			int b = map.get('B') + map.get('b');
			int g = map.get('G') + map.get('g');
			if (b < g) ans = "GOOD";
			if (g < b) ans = "A BADDY";
			System.out.println(name + " is " + ans);
		}
		
		sc.close();
	}

}