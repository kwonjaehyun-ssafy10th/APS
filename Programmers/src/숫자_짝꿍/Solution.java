package 숫자_짝꿍;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();
		
		String shorter = (X.length() < Y.length()) ? X : Y;
		String longer = (X.length() >= Y.length()) ? X : Y;
		Map<Integer, Integer> shorterMap = new HashMap<>();
		Map<Integer, Integer> longerMap = new HashMap<>();
		Map<Integer, Integer> answerMap = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			shorterMap.put(i, 0);
			longerMap.put(i, 0);
			answerMap.put(i, 0);
		}
		
		for (int i = 0; i < shorter.length(); i++) {
			shorterMap.put(Character.getNumericValue(shorter.charAt(i)), shorterMap.get(Character.getNumericValue(shorter.charAt(i))) + 1);
			
		}
		
		for (int i = 0; i < longer.length(); i++) {
			longerMap.put(Character.getNumericValue(longer.charAt(i)), longerMap.get(Character.getNumericValue(longer.charAt(i))) + 1);
			
		}
		
		for (int i = 0; i < 10; i++) {
			answerMap.put(i, Math.min(shorterMap.get(i), longerMap.get(i)));
		}
		
		boolean flag = true;
		for (int i = 9; i > 0; i--) {
			if (answerMap.get(i) != 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			if (answerMap.get(0) == 0) return "-1";
			else return "0";
		}
		
		
		for (int i = 9; i >=0; i--) {
			for (int j = 0; j < answerMap.get(i); j++) {
				answer.append(i);
			}
		}

		return answer.toString();
	}
}