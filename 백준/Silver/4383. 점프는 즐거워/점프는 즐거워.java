import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int[] dif = new int[n - 1];
			for (int i = 0; i < n - 1; i++) {
				dif[i] = Math.abs(arr[i] - arr[i + 1]);
			}
			Arrays.sort(dif);
			boolean flag = true;
			for (int i = 0; i < n - 1; i++) {
				if (dif[i] != i + 1) {
					System.out.println("Not jolly");
					flag = false;
					break;
				}
			}
			if (flag)System.out.println("Jolly"); 
		}
		
		sc.close();
	}

}