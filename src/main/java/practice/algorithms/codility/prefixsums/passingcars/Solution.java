package practice.algorithms.codility.prefixsums.passingcars;


public class Solution {

    public int solution(int[] A) {
        int ret = 0;
        int total = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                ret++;
            }
            else {
                total += ret;
                if (total > 1000000000) {
                    return -1;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 0, 1, 1 };
        System.out.println(new Solution().solution(A));
    }

}
