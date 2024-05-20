import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String ans = "unrated";
		if (s.indexOf("d2") != -1 || s.indexOf("D2") != -1) {
			ans = "D2";
		}
		System.out.println(ans);
		
		sc.close();
	}

}