package practice.algorithms.codility.uncategorized.elevator;

import java.util.HashSet;

/**
 * 
 * Elevator
 */
public class Solution {

    public int solution(int[] A, int[] B, int M, int X, int Y) {
        int numberOfStops = 0;
        int nextPersonToEnter = 0;
        // Loop until consume all persons in the ground floor.
        while (nextPersonToEnter < A.length) {
            int currentTripTotalWeight = 0;
            int currentTripPersons = 0;
            // HashSet used to distinct the stops in the current trip.
            HashSet<Integer> currentTripFloorsToStop = new HashSet<Integer>();
            // Enter unless there is no space or weight.
            while (nextPersonToEnter < A.length && currentTripTotalWeight + A[nextPersonToEnter] <= 200
                    && currentTripPersons < X) {
                // Add the person stop
                currentTripFloorsToStop.add(B[nextPersonToEnter]);
                // Increase the current trip total weight by the new entered
                // person.
                currentTripTotalWeight += A[nextPersonToEnter];
                // Add one person to the total number of persons in the current
                // trip.
                currentTripPersons++;
                // Move to the next person.
                nextPersonToEnter++;
            }
            // Add the last trip distinct stops to the total number of elevator
            // stops plus a Stop for the ground.
            numberOfStops += currentTripFloorsToStop.size() + 1;
        }
        return numberOfStops;
    }

    // public static void main(String[] args) {
    // // int[] A = { 40, 40, 100, 80, 20 };
    // // int[] B = { 3, 3, 2, 2, 3 };
    // // int M = 3;
    // // int X = 5;
    // // int Y = 200;
    //
    // int[] A = { 60, 80, 40 };
    // int[] B = { 2, 3, 5 };
    // int M = 5;
    // int X = 2;
    // int Y = 200;
    //
    // System.out.println(new Solution().solution(A, B, M, X, Y));
    //
    //
    // System.out.println('b' - 'a');
    // }

    public static void main(String[] args) {
        int[] A = { 40, 40, 100, 80, 20 };
        int[] B = { 3, 3, 2, 2, 3 };
        int M = 3;
        int X = 5;
        int Y = 200;

        System.out.println(new Solution().solution(A, B, M, X, Y));

        int[] C = { 60, 80, 40 };
        int[] D = { 2, 3, 5 };
        M = 5;
        X = 2;
        Y = 200;

        System.out.println(new Solution().solution(C, D, M, X, Y));

        A = new int[] { 60, 80, 40 };
        B = new int[] { 2, 3, 5 };
        M = 5;
        X = 2;
        Y = 200;
        System.out.println(new Solution().solution(A, B, M, X, Y));

        A = new int[] { 40, 40, 100, 80, 20 };
        B = new int[] { 3, 3, 2, 2, 3 };
        M = 3;
        X = 5;
        Y = 200;
        System.out.println(new Solution().solution(A, B, M, X, Y));

        A = new int[] { 40, 40, 100, 200, 20 };
        B = new int[] { 3, 3, 2, 2, 3 };
        M = 3;
        X = 5;
        Y = 200;
        System.out.println(new Solution().solution(A, B, M, X, Y));

        A = new int[] { 40, 40, 100, 200, 20 };
        B = new int[] { 3, 3, 2, 2, 3 };
        M = 3;
        X = 1;
        Y = 200;
        System.out.println(new Solution().solution(A, B, M, X, Y));

    }

}
