package java_problems.data_structures;

import java.util.*;

/*
 * You are given an array of n integers. A sub-array is "Negative" if sum of
 * all the integers in that sub-array is negative. Count the number of
 * "Negative sub-arrays" in the input array.
 * 
 * Note: Subarrays are contiguous chunks of the main array. For example if the
 * array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5},
 * {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.
 * 
 * Input Format: 
 * The first line consists an integer n. The next line will contain n space
 * seperated integers. Value of n will be at most 100. The numbers in the array
 * will range between -10000 to 10000.
 * 
 * Output Format: 
 * Print the answer to the problem.
 * 
 * Sample Input:
 * 5
 * 1 -2 4 -5 1
 */
public class OneDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive number of integers to follow: ");
		int n = sc.nextInt();
		System.out.println("Enter "
			+ n + (n > 1 ? " integers: " : " integer: "));
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int numNeg = 0;
		for (int j = 0; j < array.length; j++) {
			int sum = 0;
			for (int k = j; k < array.length; k++) {
				sum += array[k];
				if (sum < 0) {
					numNeg++;
				}
			}
		}
		System.out.println(numNeg);
		sc.close();
	}
}