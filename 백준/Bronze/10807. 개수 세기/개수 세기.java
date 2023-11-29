import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[201];
		for (int n = 0; n < N; n++) {
			arr[sc.nextInt() + 100]++;
		}
		System.out.println(arr[sc.nextInt() + 100]);
		
		sc.close();
	}

}