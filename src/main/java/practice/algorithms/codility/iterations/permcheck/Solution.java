package practice.algorithms.codility.iterations.permcheck;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        Arrays.sort(A);

        int current = 1;

        for (int i : A) {
            if (i == current) {
                current++;
            }
            else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }

}
