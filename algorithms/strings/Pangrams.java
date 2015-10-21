package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Problem Statement: 
 * Roy wanted to increase his typing speed for programming contests. So, his
 * friend advised him to type the sentence
 * "The quick brown fox jumps over the lazy dog" repeatedly, because it is a
 * pangram. (Pangrams are sentences constructed by using every letter of the
 * alphabet at least once.)
 * 
 * After typing the sentence several times, Roy became bored with it. So he
 * started to look for other pangrams.
 * 
 * Given a sentence s, tell Roy if it is a pangram or not.
 * 
 * Input Format:
 * Input consists of a line containing s.
 * 
 * Constraints:
 * Length of s can be at most 103 (1 <= |s| <= 103) and it may contain spaces, lower
 * case and upper case letters. Lower case and upper case instances of a letter
 * are considered the same.
 * 
 * Output Format:
 * Output a line containing pangram if s is a pangram, otherwise
 * output not pangram.
 * 
 * Sample Input #1: 
 * We promptly judged antique ivory buckles for the next prize
 * 
 * Sample Output #1: 
 * pangram
 * 
 * Sample Input #2: 
 * We promptly judged antique ivory buckles for the prize
 * 
 * Sample Output #2: 
 * not pangram
 */
public class Pangrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine().toLowerCase();
        
        Set<Character> charSet = new HashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                charSet.add(new Character(input.charAt(i)));
            }
        }
        
        if (charSet.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
        sc.close();
    }
}