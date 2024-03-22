import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		String ans;
		if (A + B == C ) ans = "correct!";
		else ans = "wrong!";
		System.out.println(ans);
		
		sc.close();
	}

}