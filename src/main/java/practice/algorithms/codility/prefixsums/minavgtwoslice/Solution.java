package practice.algorithms.codility.prefixsums.minavgtwoslice;

public class Solution {

    public int solution(int[] A) {

        float minimalAvarage = Float.MAX_VALUE;
        int minimalIndex = -1;
        for (int i = 2; i < A.length; i++) {
            float temp1 = (float) (A[i - 1] + A[i] / 2.0);
            float temp2 = (float) (A[i - 2] + A[i - 1] + A[i] / 3.0);

            if (temp1 < minimalAvarage) {
                minimalIndex = i - 1;
                minimalAvarage = temp1;
            }
            if (temp2 < minimalAvarage) {
                minimalIndex = i - 2;
                minimalAvarage = temp2;
            }
        }
        return minimalIndex;

    }

    // public int solution(int[] A) {
    //
    // float[][] prefixSum = new float[A.length][A.length];
    // float minimalAvarage = Float.MAX_VALUE;
    // int minimalIndex = -1;
    // for (int i = 0; i < A.length; i++) {
    //
    // boolean considerInitialValue = true;
    //
    // for (int j = i + 1; j < A.length; j++) {
    //
    // if (considerInitialValue) {
    // prefixSum[i][j] += A[i];
    // considerInitialValue = false;
    // }
    // prefixSum[i][j] += prefixSum[i][j - 1] + A[j];
    //
    // // calc average
    // float average = (prefixSum[i][j] / (j - i + 1));
    // // set minimal
    // if (average < minimalAvarage) {
    // minimalAvarage = average;
    // minimalIndex = i;
    // }
    // }
    //
    // }
    // return minimalIndex;
    //
    // }

    public static void main(String[] args) {
        int[] A = { 4, 2, 2, 5, 1, 5, 8 };
        System.out.println(new Solution().solution(A));
    }

}
