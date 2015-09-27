package algorithms.warmup;

import java.util.*;

/*
 * Problem Statement: 
 * You are given a square matrix of size N×N. Calculate the absolute difference
 * of the sums across the two main diagonals.
 * 
 * Input Format: 
 * The first line contains a single integer N. The next N lines contain N
 * integers (each) describing the matrix.
 * 
 * Constraints:
 * 1 <= N <= 100
 * -100 <= A[i] <= 100
 * 
 * Output Format: 
 * Output a single integer equal to the absolute difference in the sums across
 * the diagonals.
 * 
 * Sample Input:
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * 
 * Sample Output:
 * 15
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowcol = sc.nextInt();
        
        int[][] array = new int[rowcol][rowcol];
        for (int i = 0; i < rowcol; i++) {
            for (int j = 0; j < rowcol; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int leftDownRightSum = 0;
        int index = 0;
        while (index < array.length) {
            leftDownRightSum += array[index][index];
            index++;
        }
        
        int rightDownLeftSum = 0;
        for (int row = 0, col = array.length - 1; row < array.length;
        		row++, col--) {
        	
        	rightDownLeftSum += array[row][col];
        }
        
        System.out.println(Math.abs(leftDownRightSum - rightDownLeftSum));
    }
}