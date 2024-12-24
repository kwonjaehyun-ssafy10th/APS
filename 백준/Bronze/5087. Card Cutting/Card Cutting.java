import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(sc.nextLine());
			int C = 0, T = 0;
			boolean flag = false;
			while (st.hasMoreTokens()) {
				char c = st.nextToken().charAt(0);
				if (c == '#') {
					flag = true;
					break;
				} else if (c == '*') break;
				else if (c == 'A') C++;
				else {
					if ((c - '0') % 2 == 1) C++;
					else T++;
				}
			}
			if (flag) break;
			String ans = "Draw";
			if (C < T) ans = "Tania";
			else if (T < C) ans = "Cheryl";
			System.out.println(ans);
		}
		
		sc.close();
	}

}