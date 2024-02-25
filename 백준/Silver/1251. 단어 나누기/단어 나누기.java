import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		int l = word.length();
		List<String> list = new ArrayList<>();
		for (int i = 1; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				String a = word.substring(0, i);
				String b = word.substring(i, j);
				String c = word.substring(j, l);
				String res = reverse(a) + reverse(b) + reverse(c);
				list.add(res);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}

	static String reverse(String word) {
		String res = "";
		for (int i = word.length() - 1; 0 <= i; i--) {
			res += word.charAt(i);
		}
		return res;
	}

}