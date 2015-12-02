package data_structures.arrays;

import java.util.Scanner;

/*
 * Problem Statement:
 * You are given a 2D array with dimensions 6*6. An hourglass in an array is
 * defined as a portion shaped like this:
 * 
 * a b c
 * d
 * e f g
 * 
 * For example, if we create an hourglass using the number 1 within an array
 * full of zeros, it may look like this:
 * 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 
 * Actually, there are many hourglasses in the array above. The three leftmost
 * hourglasses are the following:
 * 
 * 1 1 1  1 1 0  1 0 0
 * 1 0 0
 * 1 1 1  1 1 0  1 0 0
 * 
 * The sum of an hourglass is the sum of all the numbers within it. The sum for
 * the hourglasses above are 7, 4, and 2, respectively.
 * 
 * In this problem, you have to print the largest sum among all the hourglasses
 * in the array.
 * 
 * Input Format: 
 * There will be exactly 6 lines of input, each containing 6 integers separated
 * by spaces. Each integer will be between -9 and 9, inclusively.
 * 
 * Output Format: 
 * Print the answer to this problem on a single line.
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
public class TwoDArrayDS {

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