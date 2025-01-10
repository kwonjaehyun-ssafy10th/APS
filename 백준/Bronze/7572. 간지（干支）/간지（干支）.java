import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ji = "ABCDEFGHIJKL";
		int N = sc.nextInt();
		int gapja = (N + 56) % 60;
		String ans = ji.charAt(gapja % 12) + "" + gapja % 10;
		System.out.println(ans);
		
		sc.close();
	}

}