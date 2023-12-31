package 올바른_괄호;

import java.util.Stack;

class Solution {
    boolean solution(String s) {    
        Stack<Character> stack = new Stack<>();
        int i = 0;        
        do {
        	char c = s.charAt(i);
        	if (stack.isEmpty() && c == ')') {
            	return false;
            } else if (c == '(') {
            	stack.push(c);
            } else {
            	stack.pop();
            }
        	i++;
        	
        } while (i < s.length());
              
        return stack.isEmpty() || stack.peek() == ')';
    }
}