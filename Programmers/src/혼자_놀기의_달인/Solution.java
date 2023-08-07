package 혼자_놀기의_달인;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;

        boolean[] open = new boolean[cards.length];
        Arrays.fill(open, false);
        List<Integer> list = new ArrayList<>();

        boolean flag = false;
        int idx = 0;
        int cnt = 0;
        while (idx < cards.length) {
            int j = idx;
            while (!open[cards[j] - 1]) {
                flag = true;
                cnt++;
                open[cards[j] - 1] = true;
                j = cards[j] - 1;
            }
            if (flag) {
                list.add(cnt);
                flag = false;
            }
            cnt = 0;
            while (idx < cards.length && !open[idx++]) {
            };
        }
        int[] group = new int[list.size()];
        for (int num = 0; num < list.size();num++) {
            group[num] = list.get(num);
        }
        for (int j = 0;j < list.size() - 1;j++) {
            for (int k = j + 1; k < list.size();k++) {
                answer = Math.max(answer,  list.get(j) * list.get(k));
            }
        }

        System.out.println(list);
        return answer;
    }
}
