package practice.algorithms.leetcode.medium.pow;

public class Solution {

    public double myPow(double x, int m) {
        double temp = x;
        if (m == 0)
            return 1;
        temp = myPow(x, m / 2);
        if (m % 2 == 0)
            return temp * temp;
        else {
            if (m > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2, -10));
    }
}