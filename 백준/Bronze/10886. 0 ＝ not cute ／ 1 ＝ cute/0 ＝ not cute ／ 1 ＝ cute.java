import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vote = new int[2];
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			vote[sc.nextInt()]++;
		}
		String ans = "Junhee is not cute!";
		if (vote[0] < vote[1]) ans = "Junhee is cute!";
		System.out.println(ans);
		sc.close();
	}

}