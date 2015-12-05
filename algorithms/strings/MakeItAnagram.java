package algorithms.strings;

import java.util.Scanner;

/*
 * Problem Statement:
 * Alice recently started learning about cryptography and found that anagrams
 * are very useful. Two strings are anagrams of each other if they have same
 * character set and same length. For example strings "bacdc" and "dcbac" are
 * anagrams, while strings "bacdc" and "dcbad" are not.
 * 
 * Alice decides on an encryption scheme involving 2 large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. She need your help in finding out this
 * number.
 * 
 * Given two strings (they can be of same or different length) help her in
 * finding out the minimum number of character deletions required to make two
 * strings anagrams. Any characters can be deleted from any of the strings.
 * 
 * Input Format:
 * Two lines each containing a string.
 * 
 * Constraints:
 * 1 <= Length of A,B <= 10000
 * A and B will only consist of lowercase latin letter.
 * 
 * Output Format:
 * A single integer which is the number of character deletions.
 * 
 * Sample Input: 
 * cde
 * abc
 * 
 * Sample Output: 
 * 4
 */
public class MakeItAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputA = sc.nextLine();
		String inputB = sc.nextLine();
		System.out.println(minCharsDeletedForAnagram(inputA, inputB));

		sc.close();
	}

	private static int minCharsDeletedForAnagram(String strA, String strB) {

		int[] charsA = new int[26];
        int[] charsB = new int[26];
        int charsRequiredToDelete = 0;
        
        for (int i = 0; i < strA.length(); i++) {
            charsA[strA.charAt(i) - 97]++;
        }
        
        for (int i = 0; i < strB.length(); i++) {
            charsB[strB.charAt(i) - 97]++;
        }

        for (int i = 0; i < charsA.length; i++) {
        	charsRequiredToDelete += Math.abs(charsA[i] - charsB[i]);
        }
		return charsRequiredToDelete;
	}
}