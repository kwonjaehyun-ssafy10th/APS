import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			String line = sc.nextLine();
			Map<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c != ' ') {
					if (map.containsKey(c)) map.put(c, map.get(c) + 1);
					else map.put(c, 1);
				}
			}
			int M = 0;
			List<Character> list = new ArrayList<>();
			for (char c:map.keySet()) {
				if (M < map.get(c)) {
					M = map.get(c);
					list.clear();
					list.add(c);
				} else if (M == map.get(c)) {
					list.add(c);
				}
			}
			if (list.size() == 1) {
				System.out.println(list.get(0));
			} else {
				System.out.println("?");
			}
		}
		
		sc.close();
	}

}