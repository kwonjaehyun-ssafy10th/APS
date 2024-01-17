import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int back = 0;
		for (int n = 0; n < N; n++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			switch (st.nextToken()) {
				case "push":
					back = Integer.parseInt(st.nextToken());
					queue.add(back);
					break;
				case "pop":
					if (queue.isEmpty()) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(queue.poll()));
					}	
					bw.newLine();
					break;
				case "size":
					bw.write(String.valueOf(queue.size()));
					bw.newLine();
					break;
				case "empty":
					if (queue.isEmpty()) {
						bw.write(String.valueOf(1));
					} else {
						bw.write(String.valueOf(0));
					}
					bw.newLine();
					break;
				case "front":
					if (queue.isEmpty()) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(queue.peek()));
					}
					bw.newLine();
					break;
				case "back":
					if (queue.isEmpty()) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(back));
					}
					bw.newLine();
					break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}