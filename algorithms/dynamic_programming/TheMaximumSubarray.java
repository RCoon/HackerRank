package algorithms.dynamic_programming;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Given an array A={a1,a2,...,aN} of N elements, find the maximum possible sum of
 * a
 * 
 *   1.  Contiguous subarray
 *   2.  Non-contiguous (not necessarily contiguous) subarray.
 *   
 * Empty subarrays/subsequences should not be considered.
 * 
 * Input Format: 
 * First line of the input has an integer T. T cases follow.
 * Each test case begins with an integer N. In the next line, N integers follow
 * representing the elements of array A.
 * 
 * Constraints: 
 * 1 <= T <= 10
 * 1 <= N <= 105
 * -104 <= ai <= 104
 * The subarray and subsequences you consider should have at least one element.
 * 
 * Output Format: 
 * Two, space separated, integers denoting the maximum contiguous and
 * non-contiguous subarray. At least one integer should be selected and put into
 * the subarrays (this may be required in cases where all elements are
 * negative).
 * 
 * Sample Input: 
 * 2
 * 4
 * 1 2 3 4
 * 6
 * 2 -1 2 3 4 -5
 * 
 * Sample Output: 
 * 10 10
 * 10 11
 */
public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int arrayLength = sc.nextInt();
            int[] array = new int[arrayLength];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            
            int[] maxes = maxContSubAndNonContSub(array);
            
            System.out.println(maxes[0] + " " + maxes[1]);
        }
        sc.close();
    }
    
    private static int[] maxContSubAndNonContSub(int[] array) {
        
        int currentSum = array[0];
        int bestSum = array[0];
        int bestNonContSum = array[0];
        
        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(currentSum + array[i], array[i]);
            bestSum = Math.max(bestSum, currentSum);
            
            if (array[i] > 0 && bestNonContSum <= 0) {
                bestNonContSum = array[i];
            } else if (array[i] > 0) {
                bestNonContSum += array[i];
            }
        }
        
        int[] bestContAndNonContSums = new int[2];
        bestContAndNonContSums[0] = bestSum;
        bestContAndNonContSums[1] = bestNonContSum;
        
        return bestContAndNonContSums;        
    }
}