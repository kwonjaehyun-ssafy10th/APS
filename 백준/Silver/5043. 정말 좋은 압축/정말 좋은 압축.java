import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		int b = sc.nextInt();
		String ans = "no";
		if (N < Math.pow(2, b + 1)) ans = "yes";
		System.out.println(ans);
		
		sc.close();
	}

}