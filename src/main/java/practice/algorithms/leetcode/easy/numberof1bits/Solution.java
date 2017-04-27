package practice.algorithms.leetcode.easy.numberof1bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        long base = 4294967295L;
        return Long.bitCount(n & base);
    }
}
