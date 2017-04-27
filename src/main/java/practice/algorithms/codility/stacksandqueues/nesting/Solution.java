package practice.algorithms.codility.stacksandqueues.nesting;

import java.util.Stack;

public class Solution {

    public int solution(String S) {

        if ("".equalsIgnoreCase(S)) {
            return 1;
        }

        if (S.length() % 2 != 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(S.charAt(i));
            }
            else if (!stack.isEmpty()) {
                Character c = stack.pop();
                if (c.equals('(') && S.charAt(i) == ')') {
                    continue;
                }
                else {
                    return 0;
                }
            }
            else {
                return 0;
            }

        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        String S = "(()())";
        System.out.println(new Solution().solution(S));
    }

}
