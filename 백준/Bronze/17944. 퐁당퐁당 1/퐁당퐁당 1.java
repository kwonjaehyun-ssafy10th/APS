import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), T = sc.nextInt();
		int[] arr = new int[4 * N - 2];
		int i = 0;
		int n = 1;
		while (i < 4 * N - 2) {
			arr[i] = n;
			if (i < 2 * N - 1) n++;
			else n--;
			i++;
		}
		System.out.println(arr[(T - 1) % (4 * N - 2)]);
		
		sc.close();	
	}

}