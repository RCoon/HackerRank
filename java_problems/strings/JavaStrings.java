package java_problems.strings;

import java.util.*;

/*
 * Today we will learn about java strings. Your task is simple, given a string,
 * find out the lexicographically smallest and largest substring of length k.
 * 
 * [Note: Lexicographic order is also known as alphabetic order dictionary
 * order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". 
 * Capital letter always comes before smaller letter, so "Happy" is smaller
 * than "happy" and "Zoo" is smaller than "ball".]
 * 
 * Input Format
 * 
 * First line will consist a string containing english alphabets which has at
 * most 1000 characters. 2nd line will consist an integer k.
 * 
 * Output Format
 * 
 * In the first line print the lexicographically minimum substring. In the
 * second line print the lexicographically maximum substring.
 * 
 * Sample Input:
 * 
 * welcometojava
 * 3
 */
public class JavaStrings {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String test = sc.nextLine();
        System.out.println("Enter an integer: ");
        int subLength = sc.nextInt();
        String min = test.substring(0, subLength);
        String max = test.substring(0, subLength);
        String sub = "";
        for (int i = 1; i < test.length() - (subLength - 1); i++) {
            sub = test.substring(i, i + subLength);
            if (min.compareTo(sub) > 0) {
                min = sub;
            } else if (max.compareTo(sub) < 0) {
                max = sub;
            }
        }
        sc.close();
        System.out.println(min);
        System.out.println(max);
    }
}