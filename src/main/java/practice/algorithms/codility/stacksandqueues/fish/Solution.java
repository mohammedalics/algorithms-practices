package practice.algorithms.codility.stacksandqueues.fish;

import java.util.Stack;

public class Solution {

    public int solution(int[] A, int[] B) {

        Stack<Integer> fishSizeStack = new Stack<Integer>();
        Stack<Integer> fishDirectionStack = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (fishSizeStack.isEmpty()) {
                fishSizeStack.push(A[i]);
                fishDirectionStack.push(B[i]);
            }
            // if the fish is in the same direction
            else if (fishDirectionStack.peek() == B[i]) {
                fishSizeStack.push(A[i]);
                fishDirectionStack.push(B[i]);
            }
            // fish is in the opposite direction
            else {
                while (!fishSizeStack.isEmpty() && B[i] == 0 && fishDirectionStack.peek() == 1
                        && A[i] > fishSizeStack.peek()) {
                    fishSizeStack.pop();
                    fishDirectionStack.pop();
                }

                if (!fishSizeStack.isEmpty()) {
                    if (B[i] == 1 && fishDirectionStack.peek() == 0 || B[i] == 0 && fishDirectionStack.peek() == 0
                            || B[i] == 1 && fishDirectionStack.peek() == 1) {
                        fishSizeStack.push(A[i]);
                        fishDirectionStack.push(B[i]);
                    }
                }
                else {
                    fishSizeStack.push(A[i]);
                    fishDirectionStack.push(B[i]);
                }
            }
        }
        return fishSizeStack.size();
    }

    public static void main(String[] args) {

        int[] A = { 4, 3, 2, 1, 5 };
        int[] B = { 0, 1, 0, 0, 0 };
        System.out.println(new Solution().solution(A, B));
    }

}
