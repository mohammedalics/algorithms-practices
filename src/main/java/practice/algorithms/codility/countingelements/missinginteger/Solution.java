package practice.algorithms.codility.countingelements.missinginteger;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);

        int min = 1;
        for (int i = 0; i < A.length; i++) {

            // skip negative integers.
            if (A[i] <= 0) {
                continue;
            }

            // skip redundant/repeated integers
            if (A[i] < min) {
                continue;
            }

            if (A[i] == min) {
                min++;
            }
            else {
                return min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        System.out.println(new Solution().solution(A));

    }

}
