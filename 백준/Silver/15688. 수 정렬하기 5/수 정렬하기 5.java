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
		for (int i = 0; i < 2000001; i++) {
			for (int j = 0; j < arr[i]; j++) {
				bw.write(String.valueOf(i - 1000000));
				bw.newLine();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}