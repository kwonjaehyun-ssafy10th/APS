import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 1;
		String[][] graph = new String[10][10];
		for (int r = 0; r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				graph[r][c] = sc.next();
			}
		}
		Boolean flag = true;
		for (int r = 0; r < 10; r++) {
			flag = true;
			String prev = graph[r][0];
			for (int c = 1; c < 10; c++) {
				if (!graph[r][c].equals(prev)) {
					flag = false;
					break;
				}
				prev = graph[r][c];
			}
			if (flag) break;
		}
		if (!flag) {
			for (int c = 0; c < 10; c++) {
				flag = true;
				String prev = graph[0][c];
				for (int r = 1; r < 10; r++) {
					if (!graph[r][c].equals(prev)) {
						flag = false;
						break;
					}
					prev = graph[r][c];
				}
				if (flag) break;
			}
		}
		if (!flag) ans = 0;
		System.out.println(ans);
		
		sc.close();
	}

}