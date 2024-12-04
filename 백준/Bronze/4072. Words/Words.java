import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		while (true) {
			String line = sc.nextLine();
			if (line.equals("#")) break;
			st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				String o = st.nextToken();
				String r = "";
				for (int i = o.length() - 1; 0 <= i; i--) {
					r += o.charAt(i);
				}
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}