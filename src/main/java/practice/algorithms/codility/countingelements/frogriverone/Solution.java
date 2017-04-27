package practice.algorithms.codility.countingelements.frogriverone;

public class Solution {

    public int solution(int X, int[] A) {
        int steps = X;
        boolean[] bitmap = new boolean[steps + 1];
        for (int i = 0; i < A.length; i++) {
            if (!bitmap[A[i]]) {
                bitmap[A[i]] = true;
                steps--;
            }
            if (steps == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 1 };
        System.out.println(new Solution().solution(1, A));
    }

}
