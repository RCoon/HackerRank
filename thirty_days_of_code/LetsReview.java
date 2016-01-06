package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Welcome to Day 6! Review everything we've learned so far by making a MadLibs
 * program in this video, or just jump right into the problem.
 * 
 * Your teacher has given you the task of drawing a staircase structure. Being
 * an expert programmer, you decided to make a program to draw it for you
 * instead. Given the required height, can you print a staircase as shown in the
 * example?
 * Note: The last line has zero spaces before it.
 * 
 * Good luck!
 * 
 * Constraints:
 * 1 <= N <= 100
 * 
 * Input Format: 
 * You are given an integer N depicting the height of the staircase.
 * 
 * Output Format: 
 * Print a staircase of height N that consists of # symbols and spaces as given
 * in Sample Output.
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
public class LetsReview {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int height = sc.nextInt();
        
        int numSymbols = 1;
        while (numSymbols <= height) {
            
            for (int i = height - numSymbols; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = height; j > height - numSymbols; j--) {
                System.out.print("#");
            }
            System.out.println();
            numSymbols++;
        }
        sc.close();
    }
}