package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>Problem Statement</p>
 * <p>Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the
 * array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum
 * of elements after it.</p>
 *
 * <p>Input:</p>
 * <p>The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow.
 * First line of each test case contains an integer N denoting the size of the array. Then in the next line are N
 * space separated values of the array A.</p>
 *
 * <p>Output:</p>
 * <p>For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium
 * point exists print -1.</p>
 *
 * <p>Constraints:</p>
 * 1 <= T <= 100,
 * 1 <= N <= 10^6,
 * 1 <= Ai <= 10^8</p>
 *
 * <p>Example:</p>
 * <p>Input:</p>
 * <ul>
 *     <li>2</li>
 *     <li>1</li>
 *     <li>1</li>
 *     <li>5</li>
 *     <li>1 3 5 2 2</li>
 * </ul>
 * <p>Output:</p>
 * <ul>
 *     <li>1</li>
 *     <li>3</li>
 * </ul>
 *
 * <p>Explanation:</p>
 * <p>Testcase 1: Since its the only element hence its the only equilibrium point.</p>
 * <p>Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).</p>
 *
 */
public class EquilibriumPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int size = Integer.parseInt(br.readLine());
            int[] data = new int[size];
            String[] strs = br.readLine().trim().split("\\s+");
            for (int i = 0; i < strs.length; i++) {
                data[i] = Integer.parseInt(strs[i]);
            }
            findEquilibriumPoint(size, data);
        }
        br.close();
    }

    private static void findEquilibriumPoint(int size, int[] data) {
        if (data != null && size > 0) {
            int lSum = 0;
            int rSum;
            int totalSum = 0;
            for (int datum : data) {    //Calculate the total sum
                totalSum += datum;
            }

            rSum = totalSum;            //Assuming the right sum is the total sum. Important so that we can decrease it
                                        //until left sum == right sum.

            for (int i = 0; i < data.length; i++) {
                rSum -= data[i];        //Decrease right sum
                if (lSum == rSum) {     //If found the point
                    System.out.println(i + 1);
                    return;
                }
                lSum += data[i];        //Increase left sum if left sum != right sum. At this time the equilibrium point
                                        //moves forward 1 index.
            }
            System.out.println(-1);
        }
    }

}
