package java_problems.strings;

import java.util.*;

/*
 * Given a string A, print "Yes" if it is a palindrome, print "No" otherwise.
 * The strings will consist lower case english letters only. The strings will
 * have at most 50 characters.
 * 
 * Some examples of palindromes are "madam", "anna", "reviver".
 * 
 * Sample Input:
 * madam
 * 
 * Sample Output:
 * Yes
 */
public class Reverse {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}