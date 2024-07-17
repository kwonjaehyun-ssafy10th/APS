import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), L = sc.nextInt();
		int ans = 0;
		int i = 0;
		String LString = String.valueOf(L);
		while (ans < N) {
			i++;
			String iString = String.valueOf(i);
			if (!iString.contains(LString)) ans++;
		}
		System.out.println(i);
		
		sc.close();
	}

}