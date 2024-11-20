import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		int ans = -1;
		if (B < C) {
			ans = A / (C - B) + 1;
		}
		System.out.println(ans);
		
		sc.close();
	}

}