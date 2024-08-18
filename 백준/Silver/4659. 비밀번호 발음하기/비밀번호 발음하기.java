import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Character[] vowelsArr = { 'a', 'e', 'i', 'o', 'u' };
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(vowelsArr));
		
		while (true) {
			String pw = sc.next();
			if (pw.equals("end")) break;
			boolean flag = false;
			for (int i = 0; i < pw.length(); i++) {
				if (vowels.contains(pw.charAt(i))){
					flag = true;
					break;
				}
			}
			if (flag) {
				int cc = 0;
				int cv = 0;
				String prev = "";
				if (vowels.contains(pw.charAt(0))) {
					prev = "vowel";
					cv = 1;
				} else {
					prev = "consonant";
					cc = 1;
				}
				for (int i = 1; i < pw.length(); i++) {
					if (prev.equals("vowel")) {
						if (vowels.contains(pw.charAt(i))) {
							cv++;
							if (cv == 3) {
								flag = false;
								break;
							}
						} else {
							prev = "consonant";
							cv = 0;
							cc = 1;
						}
					} else {
						if (vowels.contains(pw.charAt(i))) {
							prev = "vowel";
							cv = 1;
							cc = 0;
						} else {
							cc++;
							if (cc == 3) {
								flag = false;
								break;
							}
						}
					}
				}
				if (flag) {
					for (int i = 0; i < pw.length(); i++) {
						char c = pw.charAt(i);
						if (c != 'e' && c != 'o') {
							String temp = c + "" + c;
							if (pw.contains(temp)) {
								flag = false;
								break;
							}
						}
					}
				}
			}
			String bool = "not ";
			if (flag) {
				bool = "";
			}
			System.out.println(String.format("<%s> is %sacceptable.", pw, bool));
		}
		
		sc.close();
	}

}