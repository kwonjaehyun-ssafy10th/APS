import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			int bedCnt = Integer.parseInt(st.nextToken());
			String ad;
			if (bedCnt == 0) break;
			else ad = st.nextToken();
			Set<Character> onBed = new HashSet<>();
			Set<Character> walkedAway = new HashSet<>();
			int cnt = 0;
			for (int i = 0; i < ad.length(); i++) {
				char a = ad.charAt(i);
				if (!onBed.contains(a) && !walkedAway.contains(a)) {
					if (onBed.size() == bedCnt) {
						walkedAway.add(a);
					} else {
						onBed.add(a);
					}
				} else {
					if (onBed.contains(a)) {
						onBed.remove(a);
					} else {
						walkedAway.remove(a);
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				bw.write("All customers tanned successfully.");
				bw.newLine();
			} else {				
				bw.write(String.format("%d customer(s) walked away.", cnt));
				bw.newLine();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}