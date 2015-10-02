package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Your teacher has given you the task to draw the structure of a staircase.
 * Being an expert programmer, you decided to make a program for the same. You
 * are given the height of the staircase. You need to print a staircase as shown
 * in the example.
 * 
 * Input Format: 
 * You are given an integer N depicting the height of the staircase.
 * 
 * Constraints:
 * 1 <= N <= 100
 * 
 * Output Format: 
 * Draw a staircase of height N in the format given below.
 * 
 * For example:
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 * 
 * Sample Input:
 * 6
 * 
 * Sample Output:
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int height = sc.nextInt();
        
        for (int i = height - 1, j = 1; i >= 0; i--, j++) {
            printSpaces(i);
            printStairs(j);
            System.out.println();
        }
        sc.close();
    }
    
    private static void printSpaces(int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
    }
    
    private static void printStairs(int numStairs) {
        for (int i = 0; i < numStairs; i++) {
            System.out.print("#");
        }
    }
}