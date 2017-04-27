package practice.algorithms.codility.uncategorized.maxnodigitpassword;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    public int solution(String S) {

        OptionalInt max = Arrays.stream(S.split("[0-9]+")).filter(s -> s.matches("(.+)?[A-Z](.+)?"))
                .mapToInt(String::length).max();
        return max.isPresent() ? max.getAsInt() : -1;
    }

    public static void main(String[] args) {
        String S = " ";
        System.out.println(new Solution().solution(S));
    }
}
