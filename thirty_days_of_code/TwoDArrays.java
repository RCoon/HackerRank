package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * Given a 6×6 2D Array, A:
 * 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 
 * We can find 16 hourglasses in A; we define an hourglass in A to be a subset
 * of values with indexes falling in this pattern in A's graphical
 * representation:
 * a b c
 * d
 * e f g
 * 
 * The sum of an hourglass is the sum of the values within it.
 * 
 * Your task is to calculate the sum of every hourglass in some 2D Array, A, and
 * print the largest value (maximum of the sums) as your answer.
 * 
 * Input Format: 
 * There are 6 lines of input, where each line contains 6 space-separated
 * integers describing 2D Array A; every value in A will be in the inclusive
 * range of -9 to 9.
 * 
 * Constraints
 * -9 <= A[i][j] <= 9
 * 0 <= i,j <= 5
 * 
 * Output Format: 
 * Print the largest (maximum) hourglass sum found in A.
 * 
 * Sample Input: 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * 
 * Sample Output: 
 * 19
 */
public class TwoDArrays {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 6; column++) {
				array[row][column] = sc.nextInt();
			}
		}
        int largest = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int total = hourglassSum(array, row, column);
                largest = Math.max(largest, total);
            }
        }
        sc.close();
        System.out.println(largest);
    }
    
    public static int hourglassSum(int[][] nums, int r, int c) {
        int sum = 0;
        for (int row = r; row < r + 3; row++) {
            if (row == r + 1) {
                sum += nums[row][c + 1];
            } else {
                for (int column = c; column < c + 3; column++) {
                    sum += nums[row][column];
                }
            }
        }
        return sum;
    }
}