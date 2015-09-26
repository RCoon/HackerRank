package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given an array of integers of size N. You need to print the sum of
 * the elements of the array.
 * 
 * Input Format: 
 * The first line of the input consists of an integer N. The next line contains
 * N space-separated integers describing the array.
 * 
 * Constraints:
 * 1 <= N <= 10
 * 0 <= A[i] <= 10^10
 * 
 * Output Format: 
 * Output a single value equal to the sum of the elements of the array.
 * 
 * Sample Input:
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * 
 * Sample Output:
 * 5000000015
 */
public class AVeryBigSum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        
        long sum = 0;
        for (int i = 0; i < numElements; i++) {
            sum += sc.nextLong();
        }
        sc.close();
        
        System.out.println(sum);
    }
}