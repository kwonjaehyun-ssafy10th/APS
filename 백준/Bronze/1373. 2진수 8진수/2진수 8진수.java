import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String b = sc.next();
		int l = b.length();
		if (l % 3 == 1) {
			b = "00" + b;
			l += 2;
		} else if (l % 3 == 2) {
			b = "0" + b;
			l++;
		}
		for (int i = 0; i < l / 3; i++) {
			int o = Integer.parseInt(b.substring(i * 3, (i + 1) * 3), 2);
			sb.append(o);
		}
		System.out.println(sb);
		
		sc.close();
	}

}