import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[][] map = new char[N][N];
		for (int r = 0; r < N; r++) {
			String line = sc.next();
			for (int c = 0; c < N; c++) {
				map[r][c] = line.charAt(c);
			}
		}
		int hor = 0, ver = 0;
		for (int r = 0; r < N; r++) {
			int cnt = 0;
			for (int c = 0; c < N; c++) {
				if (map[r][c] == '.') cnt++;
				else {
					if (1 < cnt) hor++;
					cnt = 0;
				}
			}
			if (1 < cnt) hor++;
		}
		for (int c = 0; c < N; c++) {
			int cnt = 0;
			for (int r = 0; r < N; r++) {
				if (map[r][c] == '.') cnt++;
				else {
					if (1 < cnt) ver++;
					cnt = 0;
				}
			}
			if (1 < cnt) ver++;
		}
		System.out.println(hor + " " + ver);
		
		sc.close();
	}

}