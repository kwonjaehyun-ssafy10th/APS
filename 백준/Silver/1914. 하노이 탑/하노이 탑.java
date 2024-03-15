import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		BigInteger ans = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE);
		System.out.println(ans);
		if (N <= 20) hanoi(1, 3, N);
		
		sc.close();
	}
	
	static void hanoi(int start, int end, int num) {
		if (num == 1) System.out.println(start + " " + end);
		else {
			int temp = 6 - start - end;
			hanoi(start, temp, num - 1);
			System.out.println(start + " " + end);
			hanoi(temp, end, num - 1);
		}
	}

}