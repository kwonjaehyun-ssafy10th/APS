import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int n = 0; n < N; n++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			switch (st.nextToken()) {
				case "push":
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(stack.pop()));
					}	
					bw.newLine();
					break;
				case "size":
					bw.write(String.valueOf(stack.size()));
					bw.newLine();
					break;
				case "empty":
					if (stack.isEmpty()) {
						bw.write(String.valueOf(1));
					} else {
						bw.write(String.valueOf(0));
					}
					bw.newLine();
					break;
				case "top":
					if (stack.isEmpty()) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(stack.peek()));
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