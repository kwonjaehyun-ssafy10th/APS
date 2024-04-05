import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0, sum = 0, start = 0, end = 0;
		while (end <= N) {
			if (sum < N) {
				end++;
				sum += end;
			} else if (N < sum) {
				sum -= start;
				start++;
			} else {
				cnt++;
				end++;
				sum += end;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}