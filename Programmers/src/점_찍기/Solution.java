package 점_찍기;

class Solution {
	public long solution(int k, int d) {
		long answer = 0;

		for (int i = 0; i * k <= d; i++) {
			for (int j = 0; j * k <= d; j++) {
				if (distance(i * k, j * k) <= d) {
					answer++;
				} else {
					break;
				}
			}
		}
		
		return answer;
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
}