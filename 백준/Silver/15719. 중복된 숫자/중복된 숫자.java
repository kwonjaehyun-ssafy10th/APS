import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		int num = 0;
		int c = 0;
		while ((c = br.read()) != -1) {
			if ('0' <= c && c <= '9') {
				num = num * 10 + (c - '0');
			} else {
				sum += num;
				num = 0;
			}
		}
		sum += num;
		System.out.println(sum - ((long) N * (N - 1) / 2));
		
		br.close();
	}

}