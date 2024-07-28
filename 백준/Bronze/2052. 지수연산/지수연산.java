import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		BigDecimal ans = new BigDecimal(Math.pow(2, -N));
		System.out.println(ans.toPlainString());
		
		sc.close();	
	}

}