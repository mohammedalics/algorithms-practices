package practice.algorithms.codility.uncategorized.minvalue;

import java.util.Arrays;

class Solution {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        ;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n && i < m; k++) {
            while (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] A = {1, 2, 3, 4};
        // int[] B = {1, 5, 6, 8};

        // int[] A = {2, 5, 6, 8};
        // int[] B = {3, 5, 6, 8};

        // int[] A = {2, 7, 8, 12};
        // int[] B = {1, 6, 11, 12};

        // int[] A = {2, 7, 8, 12};
        // int[] B = {1, 6, 11, 12, 13};

        // int[] A = {2, 7, 8, 12, 13};
        // int[] B = {1, 6, 11, 12};

        // int[] A = {2};
        // int[] B = {1};

        // int[] A = {1};
        // int[] B = {2};

        // int[] A = {};
        // int[] B = {1};

        // int[] A = {1, 5, 8, 11, 12};
        // int[] B = {2, 3, 7, 1, 12};
        // int[] A = {2, 1};
        // int[] B = {3, 3};

        int[] A = { 1, 2, 3, 4 };
        int[] B = { 5, 6, 7 };

        System.out.println(new Solution().solution(A, B));
    }
}