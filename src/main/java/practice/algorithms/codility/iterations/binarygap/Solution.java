package practice.algorithms.codility.iterations.binarygap;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

    public int solution(int N) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        char[] binaryString = Integer.toBinaryString(N).toCharArray();
        int max = 0;
        list.add(max);
        boolean currentlyCounting = false;
        for (char c : binaryString) {
            if (c == '1' && currentlyCounting) {
                list.add(max);
                max = 0;
                currentlyCounting = false;
            }
            else if (c == '0' && !currentlyCounting) {
                currentlyCounting = true;
                max = 1;
            }
            else if (c == '0' && currentlyCounting) {
                max++;
            }
            else if (c == '1' && !currentlyCounting) {

            }
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
    }

}
