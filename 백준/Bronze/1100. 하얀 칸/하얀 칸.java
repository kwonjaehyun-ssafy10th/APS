import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.next();
		}
		int ans = 0;
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if (r % 2 == c % 2) {
					if (arr[r].charAt(c) == 'F') ans++;
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}