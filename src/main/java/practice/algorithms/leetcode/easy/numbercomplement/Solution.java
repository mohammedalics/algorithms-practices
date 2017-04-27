package practice.algorithms.leetcode.easy.numbercomplement;

public class Solution {
    public int findComplement(int num) {
        int numberBinaryLenth = Integer.toBinaryString(num).length();
        int complement = ~num;
        String com = Integer.toBinaryString(complement);
        com = com.substring(com.length() - numberBinaryLenth);
        return Integer.parseInt(com, 2);
    }
}