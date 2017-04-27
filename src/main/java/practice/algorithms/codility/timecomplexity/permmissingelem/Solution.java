package practice.algorithms.codility.timecomplexity.permmissingelem;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] A) {
        int total = IntStream.of(A).sum();
        int newTotal = Stream.iterate(1, n -> n + 1).limit(A.length + 1).collect(Collectors.summingInt(n -> n));
        return newTotal - total;
    }

    public static void main(String[] args) {
        int[] A = { 2, 3, 1, 5 };
        System.out.println(new Solution().solution(A));
    }
}
