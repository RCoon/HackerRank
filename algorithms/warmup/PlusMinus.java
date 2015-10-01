package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You're given an array containing integer values. You need to print the
 * fraction of count of positive numbers, negative numbers and zeroes to the
 * total numbers. Print the value of the fractions correct to 3 decimal places.
 * 
 * Input Format: 
 * First line contains N, which is the size of the array.
 * Next line contains N integers A1,A2,A3,...,AN, separated by space.
 * 
 * Constraints:
 * 1 <= N <= 100
 * -100 <= Ai <= 100
 * 
 * Output Format: 
 * Output three values on different lines equal to the fraction of count of
 * positive numbers, negative numbers and zeroes to the total numbers
 * respectively correct to 3 decimal places.
 * 
 * Sample Input:
 * 6
 * -4 3 -9 0 4 1
 * 
 * Sample Output:
 * 0.500
 * 0.333
 * 0.167
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numElements = sc.nextInt();
        
        int numPos = 0;
        int numNeg = 0;
        int numZero = 0;
        //int num;
        
        for (int i = 0; i < numElements; i++) {
            int num = sc.nextInt();
            
            if (num > 0) {
                numPos++;
            } else if (num < 0) {
                numNeg++;
            } else {
                numZero++;
            }
        }
        sc.close();
        
        double percentPos = (double) numPos / numElements;
        double percentNeg = (double) numNeg / numElements;
        double percentZero = (double) numZero / numElements;
        
        System.out.printf("%.3f %n", percentPos);
        System.out.printf("%.3f %n", percentNeg);
        System.out.printf("%.3f", percentZero);
    }
}