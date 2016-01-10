package thirty_days_of_code;

import java.util.*;

/*
 * Problem Statement:
 * For this challenge, convert a given number, n, from decimal (base 10) to
 * binary (base 2).
 * 
 * Input Format: 
 * The first line contains a single integer, T, the number of test cases. The T
 * subsequent lines of test cases each contain a single value, n, the base 10
 * positive integer to be converted.
 * 
 * Constraints:
 * 1 <= T <= 1000
 * 1 <= n <= 231
 * 
 * Output Format: 
 * For each test case, print the value of n in binary on a new line.
 * 
 * Sample Input: 
 * 2
 * 4
 * 5
 * 
 * Sample Output: 
 * 100
 * 101
 */
public class BinaryNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            int num = sc.nextInt();
            System.out.println(Integer.toBinaryString(num));
        }
        sc.close();
    }
}