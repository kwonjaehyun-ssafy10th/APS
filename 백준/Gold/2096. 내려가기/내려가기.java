import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] dpMax= new int[N][3];
		int[][] dpMin = new int[N][3];
		for (int i = 0; i < 3; i++) {
			dpMax[0][i] = sc.nextInt();
			dpMin[0][i] = dpMax[0][i];
		}
		for (int n = 0; n < N - 1; n++) {
			int num1 = sc.nextInt();
			dpMax[n + 1][0] = Math.max(dpMax[n][0], dpMax[n][1]) + num1;
			dpMin[n + 1][0] = Math.min(dpMin[n][0], dpMin[n][1]) + num1;
			int num2 = sc.nextInt();
			dpMax[n + 1][1] = Math.max(Math.max(dpMax[n][0], dpMax[n][1]), dpMax[n][2]) + num2;
			dpMin[n + 1][1] = Math.min(Math.min(dpMin[n][0], dpMin[n][1]), dpMin[n][2]) + num2;
			int num3 = sc.nextInt();
			dpMax[n + 1][2] = Math.max(dpMax[n][1], dpMax[n][2]) + num3;
			dpMin[n + 1][2] = Math.min(dpMin[n][1], dpMin[n][2]) + num3;			
		}
		
		System.out.println(String.format("%d %d", Math.max(Math.max(dpMax[N - 1][0], dpMax[N - 1][1]), dpMax[N - 1][2]), Math.min(Math.min(dpMin[N - 1][0], dpMin[N - 1][1]), dpMin[N - 1][2])));
		
		
		
		sc.close();
	}

}