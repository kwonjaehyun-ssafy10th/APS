import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] a = s.split("-");
		String ans = "";
		for (String c:a) {
			ans += c.charAt(0);
		}
		System.out.println(ans);
		
		sc.close();
	}

}