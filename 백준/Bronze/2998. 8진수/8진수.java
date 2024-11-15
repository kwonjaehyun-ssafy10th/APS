import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Character> map = new HashMap<>();
		map.put("000", '0');
		map.put("001", '1');
		map.put("010", '2');
		map.put("011", '3');
		map.put("100", '4');
		map.put("101", '5');
		map.put("110", '6');
		map.put("111", '7');
		String b = sc.next();
		int l = b.length();
		String c = "";
		for (int i = 0; i < (3 - l % 3) % 3; i++) {
			c += "0";
		}
		b = c + b;
		l = b.length();
		String o = "";
		for (int i = 0; i < l / 3; i++) {
			o += map.get(b.substring(i * 3, (i + 1) * 3));
		}
		System.out.println(o);
		
		sc.close();
	}

}