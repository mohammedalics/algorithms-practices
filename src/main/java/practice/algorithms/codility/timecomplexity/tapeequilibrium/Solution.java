package practice.algorithms.codility.timecomplexity.tapeequilibrium;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution {

    public int solution(int[] A) {

        int total = IntStream.of(A).sum();

        Integer[] list = new Integer[A.length - 1];

        int totalLeft = 0;
        for (int i = 1; i < A.length; i++) {
            totalLeft += A[i - 1];
            total = total - A[i - 1];
            list[i - 1] = Math.abs(total - totalLeft);
        }

        return Collections.min(Arrays.asList(list));

    }
}
