package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Suppose you have a string S which has length N and is indexed from 0 to N-1.
 * String R is the reverse of the string S. The string S is funny if the
 * condition |Si-Si-1|=|Ri-Ri-1| is true for every i from 1 to N-1.
 * 
 * (Note: Given a string str, stri denotes the ascii value of the ith character
 * (0-indexed) of str. |x| denotes the absolute value of an integer x)
 * 
 * Input Format: 
 * First line of the input will contain an integer T. T testcases follow. Each
 * of the next T lines contains one string S.
 * 
 * Constraints: 
 * 1 <= T <= 10
 * 2 <= length of S <= 10000
 * 
 * Output Format: 
 * For each string, print Funny or Not Funny in separate lines.
 * 
 * Sample Input: 
 * 2
 * acxz
 * bcxz
 * 
 * Sample Output: 
 * Funny
 * Not Funny
 */
public class LookAtEverythingWeLearned {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            String input = sc.next();
            if (isFunny(input)) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
        sc.close();
    }
    
    private static boolean isFunny(String str) {
        
        boolean funny = true;
        
        int fwdIndex = 1;
        int bwdIndex = str.length() - 1;
        int fwdCharVal;
        int bwdCharVal;
        
        while (fwdIndex < str.length()) {
            fwdCharVal = Math.abs(str.charAt(fwdIndex) - str.charAt(fwdIndex - 1));
            bwdCharVal = Math.abs(str.charAt(bwdIndex - 1) - str.charAt(bwdIndex));
            if (fwdCharVal != bwdCharVal) {
                funny = false;
                break;
            }
            fwdIndex++;
            bwdIndex--;
        }
        
        return funny;
    }
}