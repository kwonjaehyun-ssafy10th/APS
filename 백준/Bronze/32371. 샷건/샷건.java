import java.util.Scanner;

public class Main {
	
	static int[] dr = { 0, -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dc = { 0, -1, 0, 1, 1, 1, 0, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] keyboard = new String[4];
		for (int i = 0; i < 4; i++) {
			keyboard[i] = sc.next();
		}
		String string = sc.next();
		int i = 0, j = 0;
		outer: for (i = 1; i < 3; i++) {
			for (j = 1; j < 9; j++) {
				boolean flag = true;
				for (int k = 0; k < 9; k++) {
					int r = i + dr[k];
					int c = j + dc[k];
					if (!string.contains(String.valueOf(keyboard[r].charAt(c)))) {
						flag = false;
						break;
					}
				}
				if (flag) break outer;
			}
		}
		System.out.println(keyboard[i].charAt(j));
		
		sc.close();
	}

}