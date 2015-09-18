package java_problems.strings;

import java.util.*;

/*
 * Problem Statement
 * 
 * Two strings A and B are called anagrams if they consist same characters, but
 * may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" ,
 * "TAC", "TCA" ,"ATC" and "CTA.
 * 
 * Given two strings, print "Anagrams" if they are anagrams, print
 * "Not Anagrams" if they are not. The strings may consist at most 50 english
 * characters, the comparison should NOT be case sensitive.
 * 
 * This exercise will verify that you are able to sort the characters of a
 * string, or compare frequencies of characters.
 * 
 * Sample Input:
 * anagram
 * margana
 * 
 * Sample Output:
 * Anagrams
 */
public class Anagrams {

	static boolean isAnagram(String A, String B) {
		A = A.toLowerCase();
		B = B.toLowerCase();

		if (A.length() != B.length()) {
			return false;
		}
		char[] charsInA = A.toCharArray();
		char[] charsInB = B.toCharArray();
		Arrays.sort(charsInA);
		Arrays.sort(charsInB);
		for (int i = 0; i < charsInA.length; i++) {
			if (charsInA[i] != charsInB[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		sc.close();
	}
}