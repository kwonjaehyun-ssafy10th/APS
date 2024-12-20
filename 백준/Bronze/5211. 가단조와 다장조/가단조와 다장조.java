import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int M = 0, m = 0;
		char prev = '|';
		int i = 0;
		while (i < s.length()) {
			char curr = s.charAt(i);
			if (prev == '|') {
				if (curr == 'A' || curr == 'D' || curr == 'E') m++;
				else if (curr == 'C' || curr == 'F' || curr == 'G') M++;
			}
			prev = curr;
			i++;
		}
		if (M == m) {
			if (prev == 'A' || prev == 'D' || prev == 'E') m++;
			else M++;
		}
		String ans = "C-major";
		if (M < m) ans = "A-minor";
		System.out.println(ans);
		
		sc.close();
	}

}