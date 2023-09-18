package Array1.평균값_구하기_2071;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("C:\\Users\\SSAFY\\Desktop\\APS\\array1\\src\\평균값_구하기_2071\\input.txt"));
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			double sum = 0;
			for (int j = 0; j < 10; j++) {
				sum += sc.nextInt();
			}
			System.out.println(String.format("#%d %d", i + 1, Math.round(sum / 10)));
		}

		sc.close();
	}

}