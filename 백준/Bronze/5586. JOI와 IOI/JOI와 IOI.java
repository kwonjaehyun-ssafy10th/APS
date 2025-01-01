import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int i = 0, j = 0, I = 0, J = 0;
		while (i < s.length() || j < s.length()) {
			if (0 <= i) i = s.indexOf("IOI", i);
			if (0 <= j) j = s.indexOf("JOI", j);
			if (0 <= i) {
				i++;
				I++;
			}
			if (0 <= j) {
				j++;
				J++;
			}
			if (i == -1 && j == -1) break;
		}
		System.out.println(J);
		System.out.println(I);
		
		sc.close();
	}

}