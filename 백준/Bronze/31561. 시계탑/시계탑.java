import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float M = sc.nextFloat();
		float ans;
		if (M <= 30) {
			ans = M / 2;
		} else {
			ans = 15 + (M - 30) * 3 / 2;
		}
		System.out.println(String.format("%.1f", ans));
		
		sc.close();
	}

}