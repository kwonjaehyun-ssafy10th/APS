import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		String a = sc.next();
		String ans = "NO";
		if (A.contains(a) && B.contains(a)) ans = "YES";
		System.out.println(ans);
		
		sc.close();
	}

}