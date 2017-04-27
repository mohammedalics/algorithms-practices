package practice.algorithms.codility.timecomplexity.frogjmp;

class Solution {
    public int solution(int X, int Y, int D) {
        Y = Y - X;
        int div = Y / D;
        if (Y % D != 0) {
            div = div + 1;
        }

        return div;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 85, 30));
    }
}
