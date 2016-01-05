package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement
 * 
 * Welcome to Day 5!
 * 
 * In this problem you will test your knowledge of loops. Given three integers
 * a, b, and N, output the following series:
 * 
 * a+(2^0)b,a+(2^0b)+(2^1b),......,a+(2^0b)+(2^1b)+...+2^(N-1)b
 * 
 * Input Format: 
 * The first line will contain the number of testcases T. Each of the next T
 * lines will have three integers, a, b, and N.
 * 
 * Constraints: 
 * 0 <= T <= 500
 * 0 <= a,b <= 50
 * 1 <= N <= 15
 * 
 * Output Format: 
 * Print the answer to each test case in a separate line.
 * 
 * Sample Input: 
 * 2
 * 5 3 5
 * 0 2 10
 * 
 * Sample Output: 
 * 8 14 26 50 98
 * 2 6 14 30 62 126 254 510 1022 2046
 */
public class Loops {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            
            int currentTerm = 0;
            int previous = a;
            int currentLine = 0;
            
            for (int j = 0; j < N; j++) {
                currentTerm = ((int) Math.pow(2, j)) * b;
                currentLine = currentTerm + previous;
                previous = currentLine;
                System.out.print(currentLine + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}