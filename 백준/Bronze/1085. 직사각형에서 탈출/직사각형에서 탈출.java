import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = w - x;
		arr[2] = y;
		arr[3] = h - y;
		
		int min = Math.max(w, h);
		for (int i = 0; i < 4; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int ans = min;
		
		System.out.println(ans);
		
		sc.close();
	}

}