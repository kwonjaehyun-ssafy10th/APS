package 영어_끝말잇기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		String last = null;

		List<String> used = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			if (used.contains(words[i])) {
				answer[0] = (i % n + 1);
				answer[1] = (i / n + 1);
				break;
			} else {
				used.add(words[i]);
				last = words[i];
			}
			
		}

		return answer;
	}
	
//	public static void main(String[] args) {
//		Solution s = new Solution();
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		System.out.println(Arrays.toString(s.solution(3, words)));
//	}
	
}