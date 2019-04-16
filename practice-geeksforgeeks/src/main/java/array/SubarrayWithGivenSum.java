package array;

import java.util.Scanner;

/**
 * <p>Problem Statement: Given an unsorted array A of size N of non-negative integers, find a continuous sub-array
 * which adds to a given number S.</p>
 *
 *<p>Input</p>
 * <p>The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
 * Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array
 * and S is the sum. The second line of each test case contains N space separated integers denoting the array
 * elements.</p>
 *
 * <p>Output</p>
 * <p>For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring
 * subarray from the left if sum equals to subarray, else print -1.</p>
 * <p></p>
 * <p>Constraints</p>
 * <ul>
 *     <li>1 <= T <= 100</li>
 *     <li>1 <= N <= 10^7</li>
 *     <li>1 <= Ai <= 10^10</li>
 * </ul>
 *
 * @author Trung (03/27/2019)
 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {
//        SubarrayWithGivenSum.subarrayWithGivenSum(5, 12, new int[] {1, 2, 3, 7, 5});
//        SubarrayWithGivenSum.subarrayWithGivenSum(10, 15, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//        SubarrayWithGivenSum.efficientSubarrayWithGivenSum(5, 12, new int[] {1, 2, 3, 7, 5});
        SubarrayWithGivenSum.efficientSubarrayWithGivenSum(10, 100, new int[] {1, 1, 1, 1, 1, 1, 1, 8, 50, 50});
    }

    /**
     * Find the consecutive elements that sum up to given value in the given array.
     * <p>Running time: O(n)</p>
     *
     * @param size Size of array
     * @param sum Sum of elements
     * @param data The array elements
     */
    private static void efficientSubarrayWithGivenSum(int size, int sum, int[] data) {
        if (size >= 0 && sum >= 0 && data != null) {
            int startIndex = 0;
            int currSum = 0;
            //i <= data.length to be able to apply the while-loop below to the last element,
            //otherwise, the for-loop won't run.
            for (int i = 0; i <= data.length; i++) {
                System.out.println("i: " + i);
                System.out.println("sum: " + currSum);
                //Remove trailing element if the curr sum is greater than given sum
                while (currSum > sum && startIndex < i) {
                    currSum -= data[startIndex];
                    startIndex++;
                }
                if (currSum == sum) {
                    System.out.println((startIndex + 1) + " " + i);
                    return;
                }
                if (i < size) {
                    currSum += data[i];
                    System.out.println("After: " + currSum);
                }
            }
            System.out.println(-1);
        }
    }

    /**
     * Find the consecutive elements that sum up to given value in the given array.
     * <p>Running time: O(n^2)</p>
     *
     * @param size Size of array
     * @param sum Sum of elements
     * @param data The array elements
     */
    public static void subarrayWithGivenSum(int size, int sum, int[] data) {
        if (size >= 0 && sum >= 0 && data != null) {
            int startingIndex = 0;
            while (startingIndex < data.length) {
                int currSum = 0;
                for (int i = startingIndex; i < data.length; i++) {
                    currSum += data[i];
                    if (currSum == sum) {
                        System.out.println((startingIndex + 1) + " " + (i + 1));
                        return;
                    } else if (currSum > sum) {
                        startingIndex++;
                        break;
                    }
                }
            }
            System.out.print(-1);
        }
    }
}
