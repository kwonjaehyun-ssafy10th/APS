import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int r = 31;
		int M = 1234567891;
		String str = sc.next();
		Long sum = 0L;
		for (int i = 0; i < L; i++) {
			sum += Integer.valueOf(str.charAt(i) - 96) * pow(r, i);
		}
		sum %= M;
		System.out.println(sum);
		
		sc.close();
	}
	
	static long pow(int a, int b) {
		Long ans = 1L;
		for (int i = 0; i < b; i++) {
			ans *= a;
		}
		return ans;
	}

}