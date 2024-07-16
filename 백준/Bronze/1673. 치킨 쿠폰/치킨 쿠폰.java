import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt(), k = sc.nextInt();
			int cnt = n;
			int c = n;
			while (k <= c) {
				n = c / k;
				c = c % k + n;
				cnt += n;
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}

}