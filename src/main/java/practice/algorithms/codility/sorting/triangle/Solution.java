package practice.algorithms.codility.sorting.triangle;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // int[] A = {10, 2, 5, 1, 8, 20};
        int[] A = { 10, 50, 5, 1 };
        System.out.println(new Solution().solution(A));

    }

}
