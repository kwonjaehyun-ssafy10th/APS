import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		for (int i = 0; i < 3; i++) ans += sc.nextLong();
		System.out.println(ans);
		sc.close();
	}

}