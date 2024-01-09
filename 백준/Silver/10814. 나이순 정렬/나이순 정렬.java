import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Object> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			List<Object> temp = new ArrayList<>();
			temp.add(age);
			temp.add(name);
			temp.add(n);
			list.add(temp);
		}
		
		Collections.sort(list, new Comparator<Object>() {
			public int compare(Object p1, Object p2) {
				int age = Integer.compare((int) ((List<Object>) p1).get(0), (int) ((List<Object>) p2).get(0));
				if (age != 0) {
					return age;
				} else {
					return Integer.compare((int) ((List<Object>)p1).get(2), (int) ((List<Object>)p2).get(2));
				}
			}
		});
		
		for (int n = 0; n < N; n++) {
			bw.write(((List<Object>)list.get(n)).get(0) + " " + ((List<Object>)list.get(n)).get(1)+ "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}