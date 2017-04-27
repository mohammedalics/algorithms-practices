package practice.algorithms.codility.arrays.oddoccurrencesinarray;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i = i + 2) {

            if (i == A.length - 1) {
                return A[i];
            }

            if (A[i] == A[i + 1]) {
                continue;
            }

            if (A[i] != A[i + 1] && A[i + 1] == A[i + 2]) {
                return A[i];
            }
            else {
                return A[i + 1];
            }
        }
        return 0;
    }

}
