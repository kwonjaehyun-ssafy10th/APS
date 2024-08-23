import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] sm = { '\'', ',', '-', '.', '?' };
		while (true) {
			boolean flag1 = false;
			List<Integer> spaceCnt = new ArrayList<>();
			while (true) {
				String line = sc.nextLine();
				if ("*".equals(line)) break;
				if ("#".equals(line)) {
					flag1 = true;
					break;
				}
				boolean flag2 = false;
				int cnt = 0;
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ' ') {
						cnt++;
						flag2 = true;
					} else {
						if (flag2) {
							spaceCnt.add(cnt);
							cnt = 0;
							flag2 = false;
						}
					}
				}
			}
			List<Integer> bitList = new ArrayList<>();
			for (int i:spaceCnt) {
				bitList.add((i + 1) % 2);
			}
			String string = "";
			for (int i:bitList) {
				string += i + "";
			}
			int s = bitList.size();
			for (int i = 0; i < (5 - (s % 5)) % 5; i++) {
				bitList.add(0);
			}
			List<Integer> encMsg = new ArrayList<>();
			s = bitList.size();
			for (int i = 0; i < s / 5; i++) {
				String temp = "";
				for (int j = 0; j < 5; j++) {
					temp += bitList.get(i * 5 + j) + "";
				}
				encMsg.add(Integer.parseInt(temp, 2));
			}
			String ans = "";
			for (int i: encMsg) {
				if (i == 0) {
					ans += ' ';
				} else if (i < 27) {
					ans += (char) (i + 64);
				} else {
					ans += sm[i - 27];
				}
			}
			System.out.println(ans);
			if (flag1) break;
		}
		
		sc.close();
	}

}