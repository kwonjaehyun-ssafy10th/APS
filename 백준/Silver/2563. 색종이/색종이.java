import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] map = new int[100][100];
		int ans = 0;
		for (int n = 0; n < N; n++) {
			int x = sc.nextInt(), y = sc.nextInt();
			for (int r = x; r < x + 10; r++) {
				for (int c = y; c < y + 10; c++) {
					if (map[r][c] == 0) {
						map[r][c] = 1;
						ans++;
					}
				}	
			}		
		}
		System.out.println(ans);
		
		sc.close();
	}

}