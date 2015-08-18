package java_problems.introduction;

import java.util.*;

/*
 * In this problem you will test your knowledge of Java loops. Given three
 * integers a, b, and n, output the following series:
 * 
 * a + (2^0)b, a + (2^0)b + (2^1)b,..., a + (2^0)b + (2^1)b + ... + (2^n-1)b
 * Input Format
 * 
 * The first line will contain the number of testcases t. Each of the next t
 * lines will have three integers, a, b, and n.
 * 
 * Constraints:
 * 
 * 0 <= a,b <= 50
 * 1 <= n <= 15
 * Output Format
 * 
 * Print the answer to each test case in separate lines.
 * 
 * Sample input:
 * 2
 * 0 2 10
 * 5 3 5
 */
public class JavaLoops {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        System.out.println("Enter an integer number of test cases: ");
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            System.out.println("Enter 3 integers for a, b, and n: ");
        	a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int[] cache = new int[n];
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    cache[j] = ((int) Math.pow(2, j) * b) + cache[j - 1];
                    System.out.print(" " + cache[j]);
                } else {
                    cache[j] = a + ((int) Math.pow(2, j) * b);
                     System.out.print(cache[j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}