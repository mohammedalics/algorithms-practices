package practice.algorithms.codility.sorting.numberofdiscintersections;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        double[] lowerBound = new double[A.length];
        double[] upperBound = new double[A.length];

        for (int i = 0; i < A.length; i++) {

            lowerBound[i] = (double) i - (double) A[i];
            upperBound[i] = (double) i + (double) A[i];
        }

        Arrays.sort(lowerBound);
        Arrays.sort(upperBound);

        int numberOfIntersections = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {

                // Check if both boundaries are located in the left side of the
                // X axis.
                if (upperBound[i] >= lowerBound[j]) {
                    numberOfIntersections++;
                }
                else {
                    break;
                }

                if (numberOfIntersections > 10000000) {
                    return -1;
                }

            }
        }

        return numberOfIntersections;
    }

    public static void main(String[] args) {
        int[] A = { 1, 5, 2, 1, 4, 0 };
        // int[] A = { 1, 2147483647, 0};
        System.out.println(new Solution().solution(A));
    }

}
