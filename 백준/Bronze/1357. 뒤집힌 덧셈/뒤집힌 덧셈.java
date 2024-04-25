import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(), Y = sc.nextInt();
		System.out.println(rev(rev(X) + rev(Y)));
		
		sc.close();
	}
	
	static int rev(int x) {
		String a = String.valueOf(x);
		String b = "";
		for (int i = a.length() - 1; 0 <= i; i--) {
			b += a.charAt(i);
		}
		return Integer.parseInt(b);
	}

}