package java_problems.data_structures;

import java.util.Scanner;

public class TwoDimensionalArray {

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