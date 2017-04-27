package practice.algorithms.codility.countingelements.maxcounters;

import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int N, int[] A) {

        int[] ret = new int[N];

        int maxCount = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= N && A[i] >= 1) {
                ret[A[i] - 1]++;
                if (ret[A[i] - 1] > maxCount) {
                    maxCount = ret[A[i] - 1];
                }

            }
            else if (A[i] == N + 1) {
                for (int j = 0; j < N; j++) {
                    ret[j] = maxCount;
                }

            }

        }

        return ret;
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, 4, 6, 1, 4, 4 };
        int[] ret = new Solution().solution(5, A);
        IntStream.of(ret).forEach(System.out::println);
    }

}
