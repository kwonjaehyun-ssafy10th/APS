import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		String str = Integer.toString(A * B * C);
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}