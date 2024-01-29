import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int sum = 0;
		int a = Math.round((float) n * (float) 0.15);
		for (int i = a; i < n - a; i++) {
			sum += arr[i];
		}
		System.out.println(Math.round((float) sum / ((float) (n - a * 2))));
		
		br.close();
	}

}