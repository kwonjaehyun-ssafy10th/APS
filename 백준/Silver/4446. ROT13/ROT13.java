import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] vow = "a i y e o u".replace(" ", "").toCharArray();
		char[] con = "b k x z n h d c w g p v j q t s r l m f".replace(" ", "").toCharArray();
		char[] capVow = new char[6];
		for (int i = 0; i < 6; i++) {
			capVow[i] = (char) ((int) vow[i] - 32);
		}
		char[] capCon = new char[20];
		for (int i = 0; i < 20; i++) {
			capCon[i] = (char) ((int) con[i] - 32);
		}
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < 6; i++) {
			int j = (i + 3) % 6;
			map.put(vow[i], vow[j]);
			map.put(capVow[i], capVow[j]);
		}
		for (int i = 0; i < 20; i++) {
			int j = (i + 10) % 20;
			map.put(con[i], con[j]);
			map.put(capCon[i], capCon[j]);
		}
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String ans = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				int ascii = (int) c;
				if ((65 <= ascii && ascii < 91) || (97 <= ascii && ascii < 123)) {
					ans += map.get(c);
				} else {
					ans += c;
				}
			}
			System.out.println(ans);
		}
		
		sc.close();
	}		
	
}