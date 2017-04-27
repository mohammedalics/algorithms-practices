package practice.algorithms.codility.arrays.cyclicrotation;

class Solution {
    public int[] solution(int[] A, int K) {
        if (K == 0)
            return A;

        int[] newA = new int[A.length];

        for (int i = K; i < A.length + K; i++) {
            newA[i % (A.length)] = A[(i - K)];
        }

        return newA;

    }

}
