import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> map = new HashMap<>();
		int max = 0;
		List<Character> list = new ArrayList<>();
		while (sc.hasNext()) {
			String word = sc.next();
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (map.containsKey(c)) map.put(c, map.get(c) + 1);
				else map.put(c, 1);
				if (max < map.get(c)) max = map.get(c);
			}
			
		}
		for (char c: map.keySet()) {
			if (map.get(c) == max) list.add(c);
		}
		list.sort(null);
		for (char c: list) System.out.print(c);
		
		sc.close();
	}

}