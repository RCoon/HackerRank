package data_structures.arrays;

import java.util.Scanner;

/*
 * Problem Statement: 
 * An array is a series of elements of the same type placed in contiguous memory
 * locations that can be individually referenced by adding an index to a unique
 * identifier.
 * 
 * You'll be given an array of N integers, and you have to print the integers in
 * reverse order.
 * 
 * Input Format: 
 * The first line of input contains N, the number of integers. The next line
 * contains N integers separated by a space.
 * 
 * Constraints: 
 * 1 <= N <= 1000
 * 1 <= Ai <= 10000, where Ai is the ith integer in the array.
 * 
 * Output Format: 
 * Print the N integers of the array in the reverse order on a single line
 * separated by single spaces.
 * 
 * Sample Input: 
 * 4
 * 1 4 3 2
 * 
 * Sample Output: 
 * 2 3 4 1
 */
public class ArraysDS {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numIntegers = sc.nextInt();
        int[] array = new int[numIntegers];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        sc.close();
    }
}