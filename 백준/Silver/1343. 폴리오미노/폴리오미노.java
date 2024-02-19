import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String ans = "";
		boolean flag = false;
		int i = 0;
		int cnt = 0;
		while (i <= a.length()) {
			if (i == a.length() || a.charAt(i) == '.') {
				int aCnt = cnt / 4;
				cnt %= 4;
				int bCnt = cnt / 2;
				cnt %= 2;
				if (cnt != 0) {
					flag = true;
					break;
				}
				for (int j = 0; j < aCnt; j++) {
					ans += "AAAA";
				}
				for (int j = 0; j < bCnt; j++) {
					ans += "BB";
				}
				if (i < a.length()) ans += ".";
			} else {
				cnt++;
			}
			i++;
		}
		if (flag) ans = "-1";
		System.out.println(ans);
		
		sc.close();
	}

}