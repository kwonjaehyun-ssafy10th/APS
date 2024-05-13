import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mbti = sc.next();
		Map<Character, Character> map = new HashMap<>(); 
		map.put('E', 'I');
		map.put('I', 'E');
		map.put('S', 'N');
		map.put('N', 'S');
		map.put('T', 'F');
		map.put('F', 'T');
		map.put('J', 'P');
		map.put('P', 'J');
		
		String ans = "";
		for (int i = 0; i < 4; i++) {
			ans += map.get(mbti.charAt(i));
		}
		System.out.println(ans);
		
		sc.close();
	}

}