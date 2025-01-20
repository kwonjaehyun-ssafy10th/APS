import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String word = sc.next();
			if ("#".equals(word)) break;
			List<Character> list = new ArrayList<>();
			list.add('a');
			list.add('e');
			list.add('i');
			list.add('o');
			list.add('u');
			for (int i = 0; i < word.length(); i++) {
				if (list.contains(word.charAt(0))) break;
				word = word.substring(1) + word.charAt(0);
			}
			System.out.println(word + "ay");
		}
		
		sc.close();
	}

}