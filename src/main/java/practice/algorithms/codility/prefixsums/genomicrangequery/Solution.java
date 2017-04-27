package practice.algorithms.codility.prefixsums.genomicrangequery;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] answer = new int[Q.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);

        int[] sInImpact = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            sInImpact[i] = map.get(S.charAt(i));
        }

        for (int i = 0; i < Q.length; i++) {
            int p = P[i];
            int q = Q[i];
            int min = 99;
            for (int j = p; j < q + 1; j++) {
                if (sInImpact[j] < min) {
                    min = sInImpact[j];
                }
            }
            answer[i] = min;
        }

        return answer;
    }

    public static void main(String[] args) {

        String S = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q = { 4, 5, 6 };
        int[] res = new Solution().solution(S, P, Q);
        IntStream.of(res).forEach(System.out::println);
    }

}
