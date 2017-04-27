package practice.algorithms.codility.sorting.distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {

        // commented due to java8 performance issue.

        // return (int) IntStream.of(A).distinct().count();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();

    }

    public static void main(String[] args) {
        int[] A = { 2, 1, 1, 2, 3, 1 };
        System.out.println(new Solution().solution(A));

    }

}
