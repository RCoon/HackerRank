package algorithms.strings;

import java.util.*;

/*
 * Problem Statement: 
 * Dothraki are planning an attack to usurp King Robert's throne. King Robert
 * learns of this conspiracy from Raven and plans to lock the single door
 * through which the enemy can enter his kingdom.
 * But, to lock the door he needs a key that is an anagram of a certain
 * palindrome string.
 * 
 * The king has a string composed of lowercase English letters. Help him figure
 * out whether any anagram of the string can be a palindrome or not.
 * 
 * Input Format:
 * A single line which contains the input string.
 * 
 * Constraints:
 * 1 <= length of string <= 105
 * Each character of the string is a lowercase English letter.
 * 
 * Output Format:
 * A single line which contains YES or NO in uppercase.
 * 
 * Sample Input: 01
 * aaabbbb
 * 
 * Sample Output: 01
 * YES
 * 
 * Explanation
 * A palindrome permutation of the given string is bbaaabb.
 * 
 * Sample Input: 02
 * cdefghmnopqrstuvw
 * 
 * Sample Output: 02
 * NO
 * 
 * Explanation
 * You can verify that the given string has no palindrome permutation.
 * 
 * Sample Input: 03
 * cdcdcdcdeeeef
 * 
 * Sample Output: 03
 * YES
 * 
 * Explanation
 * A palindrome permutation of the given string is ddcceefeeccdd.
 */
public class GameOfThronesI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        
        String ans;
        
        Map<Character, MutableInt> map = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
        	MutableInt count = map.get(inputString.charAt(i));
        	
        	if (count == null) {
        		map.put(inputString.charAt(i), new MutableInt());
        	} else {
        		count.increment();
        	}
        }
        
        int numOddCounts = 0;
        for (Character c : map.keySet()) {
        	if (map.get(c).value % 2 == 1) {
        		numOddCounts++;
        	}
        }
        
        if (numOddCounts <= 1) {
        	ans = "YES";
        } else {
        	ans = "NO";
        }
        System.out.println(ans);
        sc.close();
    }
}

class MutableInt {
	  int value = 1; // note that we start at 1 since we're counting
	  public void increment () { ++value;      }
	  public int  get ()       { return value; }
}