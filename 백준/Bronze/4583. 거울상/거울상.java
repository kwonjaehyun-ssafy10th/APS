import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Character> map = new HashMap<>();
		map.put('b', 'd');
		map.put('d', 'b');
   		map.put('p', 'q');
		map.put('q', 'p');
		map.put('i', 'i');
		map.put('o', 'o');
		map.put('v', 'v');
		map.put('w', 'w');
		map.put('x', 'x');
		
		while (true) {
			String word = sc.next();
			if (word.equals("#")) break;
			boolean flag = true;
			String ans = "";
			for (int i = 0; i < word.length(); i++) {
				if (!map.containsKey(word.charAt(i))) {
					flag = false;
					break;
				} else {
					ans = map.get(word.charAt(i)) + ans;
				}
			}
			if (flag) System.out.println(ans);
			else System.out.println("INVALID");
		}
		
		sc.close();
	}

}