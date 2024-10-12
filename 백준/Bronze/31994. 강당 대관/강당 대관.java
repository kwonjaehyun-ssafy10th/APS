import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ans = "";
		int max = 0;
		for (int i = 0; i < 7; i++) {
			String seminar = sc.next();
			int num = sc.nextInt();
			if (max < num) {
				max = num;
				ans = seminar;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}