package Graph2.점심_식사시간_2383;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			for (int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for (int c = 0; c < N; c++) {
					map[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			int cntP = 0;
			int cntS = 0;
			int[][] stairs = new int[2][3];
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (map[r][c] == 1) {
						cntP++;
					} else if (map[r][c] > 1) {
						stairs[cntS][0] = r;
						stairs[cntS][1] = c;
						stairs[cntS][2] = map[r][c];
						cntS++;
					}
				}
			}
			int[][] persons = new int[cntP][2];
			cntP = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (map[r][c] == 1) {
						persons[cntP][0] = r;
						persons[cntP][1] = c;
						cntP++;
					}
				}
			}
			
			int[][] time = new int[cntP][2];
			for (int p = 0; p < cntP; p++) {
				time[p][0] = Math.abs(persons[p][0] - stairs[0][0]) + Math.abs(persons[p][1] - stairs[0][1]) + stairs[0][2] + 1;
				time[p][1] = Math.abs(persons[p][0] - stairs[1][0]) + Math.abs(persons[p][1] - stairs[1][1]) + stairs[1][2] + 1;
			}
			
			Arrays.sort(time, new Comparator<int[]>() {
				public int compare(int[] arr1, int[] arr2) {
					if (arr1[0] == arr2[0]) {
						return Integer.compare(arr2[1], arr1[1]);
					} else {
						return Integer.compare(arr1[0], arr2[0]);
					}
				}
			});
			
			for (int p = 0; p < cntP; p++) {
				System.out.println(Arrays.toString(time[p]));
			}
			System.out.println(cntP);
			
			
			if (cntP > 3) {
				for (int p = 4; p < cntP; p++) {
					if (time[p - 1][0] - time[p - 3][0] <= stairs[0][2]) {
						time[p][0] += stairs[0][2] - (time[p][0] - time[p - 3][0]) + stairs[0][2] + 1; 
					}
					if (time[cntP - 1 - p][1] - time[cntP - 1 - (p - 3)][0] <= stairs[1][2]) {
						time[cntP - 1 - p][1] += stairs[1][2] - (time[cntP - 1 - p][1] - time[cntP - 1 - (p - 3)][1]) + stairs[1][2] + 1; 
					}
				}
			}
			
			int ans = 0;
			int min = 6200;
			for (int i = 1; i < cntP; i++) {
				int temp = Math.max(time[i - 1][0], time[i][1]);
				if (temp < min) min = temp;
			}
			ans = min;
			
			if (cntP == 1) ans = Math.min(time[0][0], time[0][1]);
			for (int p = 0; p < cntP; p++) {
				ans = Math.max(ans, Math.min(time[p][0], time[p][1]));
			}			
			bw.write(String.format("#%d %d\n", t, ans));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
