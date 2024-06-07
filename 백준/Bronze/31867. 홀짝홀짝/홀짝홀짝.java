import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String K = sc.next();
		int even = 0;
		int odd = 0;
		for (int n = 0; n < N; n++) {
			if (Integer.valueOf(K.charAt(n)) % 2 == 0) even++;
			else odd++; 
		}
		int ans = -1;
		if (odd < even) ans = 0;
		else if (even < odd) ans = 1;
		System.out.println(ans);
		
		sc.close();
	}

}