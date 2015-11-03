package java_problems.introduction;

import java.util.Scanner;

/*
 * Problem Statement:
 * Given an integer N as input, check the following:
 * 
 * If N is odd, print "Weird".
 * If N is even and, in between the range of 2 and 5(inclusive), print
 * "Not Weird".
 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * If N is even and N>20, print "Not Weird".
 * 
 * Input Format: 
 * There is a single line of input: integer N.
 * 
 * Constraints:
 * 1 <= N <= 100
 * 
 * Output Format: 
 * Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not
 * print the quotation marks.
 * 
 * Sample Input 1: 
 * 3
 * 
 * Sample Output 1: 
 * Weird
 * 
 * Sample Input 2: 
 * 24
 * 
 * Sample Output 2: 
 * Not Weird
 */
public class JavaIfElse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (num % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (num > 20 || num < 6) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }
        sc.close();
    }
}