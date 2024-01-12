import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[2000001];
		for (int n = 0; n < N; n++) {
			arr[Integer.parseInt(br.readLine()) + 1000000]++;
		}
		for (int n = 0; n < 2000001; n++) {
			if (arr[n] != 0) {
				bw.write((n - 1000000) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}