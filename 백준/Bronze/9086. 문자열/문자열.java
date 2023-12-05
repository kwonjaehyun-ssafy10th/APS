import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String st = sc.next();
			System.out.print(st.charAt(0));
			System.out.print(st.charAt(st.length() - 1));
			System.out.println();
		}
		
		sc.close();
	}

}