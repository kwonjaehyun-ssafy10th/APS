import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[26];
		for (int n = 0; n < N; n++) {
			String name = sc.next();
			arr[(int) name.charAt(0) - 97]++;
		}
		int cnt = 0;
		String ans = "";
		for (int i = 0; i < 26; i++) {
			if (4 < arr[i]) {
				cnt++;
				ans += (char) (i + 97);
			}
		}
		if (cnt == 0) ans = "PREDAJA";
		System.out.println(ans);
		
		sc.close();
	}

}