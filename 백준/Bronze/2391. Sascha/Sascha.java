import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = toInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			int l = word.length();
			int m = l + 1;
			String ans = "";
			int w = toInt(br.readLine());
			for (int j = 0; j < w; j++) {
				String dic = br.readLine();
				int cnt = 0;
				for (int k = 0; k < l; k++) {
					if (word.charAt(k) != dic.charAt(k)) cnt++;
				}
				if (cnt < m) {
					m = cnt;
					ans = dic;
				}
			}
			bw.write(ans);
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}

}