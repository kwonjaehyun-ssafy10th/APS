import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String ans;
		if (a.length() < 2) {
			ans = "CE";
		} else {
			if (a.charAt(0) == '"' && a.charAt(a.length() - 1) == '"') {
				if ("".equals(a.substring(1, a.length() - 1).trim())) {
					ans = "CE";
				} else {
					ans = a.substring(1, a.length() - 1);
				}
			} else {
				ans = "CE";
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}