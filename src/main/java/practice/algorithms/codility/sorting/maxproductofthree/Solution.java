package practice.algorithms.codility.sorting.maxproductofthree;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        return Math.max(A[A.length - 1] * A[A.length - 2] * A[A.length - 3], A[A.length - 1] * A[0] * A[1]);
    }

    public static void main(String[] args) {
        int[] A = { -3, 1, 2, -2, 5, 6 };
        System.out.println(new Solution().solution(A));

    }

}
