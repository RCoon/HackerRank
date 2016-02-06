package algorithms.bit_manipulation;

import java.util.Scanner;

/*
 * Given two integers, L and R, find the maximal value of A xor B, where A and B
 * satisfy the following condition:
 * 
 * L <= A <= B <= R
 * 
 * Input Format: 
 * The input contains two lines; L is present in the first line and R in the
 * second line.
 * 
 * Constraints:
 * 1 <= L <= R <= 10^3
 * 
 * Output Format: 
 * The maximal value as mentioned in the problem statement.
 * 
 * Sample Input: 
 * 10
 * 15
 * 
 * Sample Output: 
 * 7
 */
public class MaximizingXOR {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int low = Integer.parseInt(sc.nextLine());
        int high = Integer.parseInt(sc.nextLine());
        int max = -1;
        
        for (int i = low; i <= high; i++) {
            int currMax = -1;
            for (int j = i; j <= high; j++) {
                currMax = i ^ j;
                if (currMax > max) {
                    max = currMax;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}