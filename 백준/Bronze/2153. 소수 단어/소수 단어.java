import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int cnt = 0;
		for (int i = 0; i < word.length(); i++) {
			int v = (int) word.charAt(i);
			if (v < 91) v -= 38;
			else v -= 96;
			cnt += v;
		}
		boolean[] isPrime = new boolean[cnt + 1];
		for (int i = 1; i <= cnt; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i <= cnt / 2; i++) {
			if (isPrime[i]) {
				int j = 2;
				int n = i * j;
				while (n <= cnt) {
					isPrime[n] = false;
					j++;
					n = i * j;
				}	
			}
		}
		if (isPrime[cnt]) System.out.println("It is a prime word.");
		else System.out.println("It is not a prime word.");
		
		sc.close();
	}

}