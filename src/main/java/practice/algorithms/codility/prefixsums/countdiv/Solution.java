package practice.algorithms.codility.prefixsums.countdiv;

public class Solution {

    public int solution(int A, int B, int K) {
        // Java8 solution: performance fail :'(
        // return (int) IntStream.rangeClosed(A, B).filter(x -> x % K ==
        // 0).count();

        // O(n)
        // int count = 0;
        // for (int i = A; i <= B; i++) {
        // if (i % K == 0) {
        // count++;
        // }
        // }
        // return count;

        // O(1)
        int x = 0;
        if (A % K == 0) {
            ++x;
        }

        return (B / K) - (A / K) + x;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(6, 11, 2));

    }

}
