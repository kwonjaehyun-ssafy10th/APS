import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = toInt(br.readLine());
		int[] employeeCnt = new int[n];
		int[] maxSalaryArr = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = toInt(st.nextToken());
			employeeCnt[i] = m;
			int[] salaryArr = new int[m];
			int M = 0;
			for (int j = 0; j < m; j++) {
				int salary = toInt(st.nextToken());
				salaryArr[j] = salary;
				if (M < salary) M = salary;
			}
			maxSalaryArr[i] = M;
		}
		int maxSalary = 0;
		for (int i = 0; i < n; i++) {
			if (maxSalary < maxSalaryArr[i]) maxSalary = maxSalaryArr[i];
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (long) (maxSalary - maxSalaryArr[i]) * (long) employeeCnt[i];
		}
		bw.write(String.valueOf(ans));
		bw.newLine();
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	static int toInt(String string) {
		return Integer.parseInt(string);
	}

}