import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<int[]> list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] string = sc.next().split(":");
		int[] t = new int[3];
		for (int i = 0; i < 3; i++) {
			t[i] = Integer.parseInt(string[i]);
		}
		list = new ArrayList<>();
		permutation(t, new int[3], new boolean[3], 0);
		int cnt = 0;
		for (int[] arr: list) {
			int HH = arr[0], MM = arr[1], SS = arr[2];
			if (0 < HH && HH < 13 && 0 <= MM && MM < 60 && 0 <= SS && SS < 60) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
	
	static void permutation(int[] arr, int[] output, boolean[] visited, int depth) {
		if (depth == 3) {
			list.add(Arrays.copyOf(output, 3));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(arr, output, visited, depth + 1);
				visited[i] = false;
			}
		}
	}
		

}