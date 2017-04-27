package practice.algorithms.codility.stacksandqueues.stonewall;

import java.util.Stack;

public class Solution {

    public int solution(int[] H) {

        Stack<Integer> stack = new Stack<Integer>();

        int numberOfStones = 0;
        for (int i = 0; i < H.length; i++) {

            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                numberOfStones++;
            }
        }
        return numberOfStones;
    }

    public static void main(String[] args) {
        int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
        System.out.println(new Solution().solution(H));
    }

}
