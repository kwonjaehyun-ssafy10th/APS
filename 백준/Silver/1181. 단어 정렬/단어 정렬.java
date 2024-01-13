import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<List<String>> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			list.add(new ArrayList<String>());
		}
		for (int n = 0; n < N; n++) {
			String word = br.readLine();
			List<String> subList = list.get(word.length() - 1);
			if (!subList.contains(word)) subList.add(word);
		}
		for (List<String> subList: list) {
			subList.sort(String::compareToIgnoreCase);
		}
		for (List<String> subList: list) {
			for (String word: subList) {
				bw.write(word);
				bw.newLine();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}