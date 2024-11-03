import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Deque<Integer> dq = new LinkedList<>();
		int N = toInt(br.readLine());
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int c = toInt(st.nextToken());
			int X;
			switch (c) {
				case 1:
					X = toInt(st.nextToken());
					dq.addFirst(X);
					break;
				case 2:
					X = toInt(st.nextToken());
					dq.addLast(X);
					break;
				case 3:
					if (dq.isEmpty()) {
						bw.write(str(-1));
					} else {
						bw.write(str(dq.pollFirst()));
					}
					bw.newLine();
					break;
				case 4:
					if (dq.isEmpty()) {
						bw.write(str(-1));
					} else {
						bw.write(str(dq.pollLast()));
					}
					bw.newLine();
					break;
				case 5:
					bw.write(str(dq.size()));
					bw.newLine();
					break;
				case 6:
					if (dq.isEmpty()) {
						bw.write(str(1));
					} else {
						bw.write(str(0));
					}
					bw.newLine();
					break;
				case 7:
					if (dq.isEmpty()) {
						bw.write(str(-1));
					} else {
						bw.write(str(dq.peekFirst()));
					}
					bw.newLine();
					break;
				case 8:
					if (dq.isEmpty()) {
						bw.write(str(-1));
					} else {
						bw.write(str(dq.peekLast()));
					}
					bw.newLine();
					break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}
	
	static String str(int integer) {
		return String.valueOf(integer);
	}

}