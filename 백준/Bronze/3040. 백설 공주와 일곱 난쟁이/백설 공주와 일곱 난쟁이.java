import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		for (int i = 0; i < 9; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> combination = new ArrayList<>();
		if (findCombination(nums, 7, 0, combination, 0)) {
			for (int num:combination) {
				System.out.println(num);
			}
		}
		
		sc.close();
	}

	static boolean findCombination(int[] nums, int size, int index, List<Integer> combination, int currentSum) {
		if (combination.size() == size) {
			return currentSum == 100;
		}
		if (nums.length <= index) {
			return false;
		}
		combination.add(nums[index]);
		if (findCombination(nums, size, index + 1, combination, currentSum + nums[index])) {
			return true;
		}
		combination.remove(combination.size() - 1);
		return findCombination(nums, size, index + 1, combination, currentSum);
	}
}