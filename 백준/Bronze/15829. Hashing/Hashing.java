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
			sum += (str.charAt(i) - 'a' + 1) * pow(r, i, M);
			sum %= M;
		}
		sum %= M;
		System.out.println(sum);
		
		sc.close();
	}
	
	static Long pow(long a, long b, long M) {
		Long ans = 1L;
		for (int i = 0; i < b; i++) {
			ans = (ans * a) % M; 
		}
		return ans;
	}

}