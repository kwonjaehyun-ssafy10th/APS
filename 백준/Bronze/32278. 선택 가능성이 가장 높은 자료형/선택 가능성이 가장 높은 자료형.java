import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		String ans = "long long";
		if (-Math.pow(2, 15) <= N && N < Math.pow(2, 15)) {
			ans = "short";
		} else if (-Math.pow(2, 31) <= N && N < Math.pow(2, 31)) {
			ans = "int";
		}
		System.out.println(ans);
		
		sc.close();
	}

}