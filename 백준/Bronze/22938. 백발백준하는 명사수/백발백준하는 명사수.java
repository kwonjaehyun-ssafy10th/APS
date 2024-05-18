import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double X1 = sc.nextDouble(), Y1 = sc.nextDouble(), R1 = sc.nextDouble();
		double X2 = sc.nextDouble(), Y2 = sc.nextDouble(), R2 = sc.nextDouble();
		String ans = "NO";
		if (Math.pow((X1 - X2), 2) + Math.pow((Y1 - Y2), 2) < Math.pow((R1 + R2), 2)) {
			ans = "YES";
		}
		System.out.println(ans);
		
		sc.close();
	}

}