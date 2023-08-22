package Day2_출력_연산.문자열_돌리기;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length());
        
        return answer;
    }
}