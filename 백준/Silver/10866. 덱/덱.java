import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static Deque<Integer> deque = new LinkedList<>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {		
				
		int N = Integer.parseInt(br.readLine());
		for (int n = 0; n < N; n++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			String str = st.nextToken();
			if (("push_front").equals(str) || ("push_back").equals(str)) {
				int a = Integer.parseInt(st.nextToken());
				if (("push_front").equals(str)) {
					pushFront(a);
				} else {
					pushBack(a);
				}
			} else if (("pop_front").equals(str)) {
				popFront();
			} else if (("pop_back").equals(str)) {
				popBack();
			} else if (("size").equals(str)) {
				size();
			} else if (("empty").equals(str)) {
				empty();
			} else if (("front").equals(str)) {
				front();
			} else {
				back();
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void pushFront(int x) {
		deque.addFirst(x);
	}
	
	static void pushBack(int x) {
		deque.addLast(x);
	}
	
	static void popFront() throws IOException {
		if (deque.isEmpty()) {
			bw.write(String.valueOf(-1));
			bw.write("\n");
		} else {
			bw.write(String.valueOf(deque.pollFirst()));			
			bw.write("\n");
		}
	}
	
	static void popBack() throws IOException {
		if (deque.isEmpty()) {
			bw.write(String.valueOf(-1));
			bw.write("\n");
		} else {
			bw.write(String.valueOf(deque.pollLast()));			
			bw.write("\n");
		}
	}
	
	static void size() throws IOException {
		bw.write(String.valueOf(deque.size()));
		bw.write("\n");
	}
	
	static void empty() throws IOException {
		if (deque.isEmpty()) {
			bw.write(String.valueOf(1));;
			bw.write("\n");
		} else {
			bw.write(String.valueOf(0));
			bw.write("\n");
		}
	}
	
	static void front() throws IOException {
		if (deque.isEmpty()) {
			bw.write(String.valueOf(-1));
			bw.write("\n");
		} else {
			bw.write(String.valueOf(deque.peekFirst()));
			bw.write("\n");
		}
	}
	
	static void back() throws IOException {
		if (deque.isEmpty()) {
			bw.write(String.valueOf(-1));
			bw.write("\n");
		} else {
			bw.write(String.valueOf(deque.peekLast()));
			bw.write("\n");
		}
	}

}