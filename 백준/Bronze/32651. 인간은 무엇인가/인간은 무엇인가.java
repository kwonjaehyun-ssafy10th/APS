import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String ans = "No";
		if (N <= 100000 && N % 2024 == 0) ans = "Yes";
		System.out.println(ans);
		
		sc.close();
	}

}