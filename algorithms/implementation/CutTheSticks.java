package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given N sticks, where the length of each stick is a positive integer.
 * A cut operation is performed on the sticks such that all of them are reduced
 * by the length of the smallest stick.
 * 
 * Suppose we have six sticks of the following lengths:
 * 5 4 4 2 2 8
 * 
 * Then, in one cut operation we make a cut of length 2 from each of the six
 * sticks. For the next cut operation four sticks are left (of non-zero length),
 * whose lengths are the following:
 * 3 2 2 6
 * 
 * The above step is repeated until no sticks are left.
 * 
 * Given the length of N sticks, print the number of sticks that are left before
 * each subsequent cut operations.
 * 
 * Note: For each cut operation, you have to recalculate the length of smallest
 * sticks (excluding zero-length sticks).
 * 
 * Input Format:
 * The first line contains a single integer N.
 * The next line contains N integers: a0, a1,... aN-1 separated by space, where
 * ai represents the length of ith stick.
 * 
 * Output Format:
 * For each operation, print the number of sticks that are cut, on separate
 * lines.
 * 
 * Constraints:
 * 1 <= N <= 1000
 * 1 <= ai <= 1000
 * 
 * Sample Input #00: 
 * 6
 * 5 4 4 2 2 8
 * 
 * Sample Output #00: 
 * 6
 * 4
 * 2
 * 1
 * 
 * Sample Input #01: 
 * 8
 * 1 2 3 4 3 3 2 1
 * 
 * Sample Output #01: 
 * 8
 * 6
 * 4
 * 1
 */
public class CutTheSticks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numSticks = sc.nextInt();

		int[] stickArray = new int[numSticks];
		stickArray[0] = sc.nextInt();

		int shortest = stickArray[0];

		for (int i = 1; i < numSticks; i++) {
			stickArray[i] = sc.nextInt();
			if (stickArray[i] < shortest) {
				shortest = stickArray[i];
			}
		}
		sc.close();
		
		while (numSticks > 0) {
			System.out.println(numSticks);

			int sticksRemaining = 0;
			
			shortest = getShortestStick(stickArray);
			
			for (int i = 0; i < stickArray.length; i++) {
				
				stickArray[i] = stickArray[i] - shortest;
				
				if (stickArray[i] > 0) {
					sticksRemaining++;
				}	
			}
			numSticks = sticksRemaining;
		}
	}
	
	private static int getShortestStick(int[] array) {
		
		if (array.length == 0) {
			return 0;
		}
		
		int shortest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && array[i] < shortest) {
				shortest = array[i];
			}
		}
		return shortest;
	}
}