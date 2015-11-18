package algorithms.strings;

import java.util.*;

/*
 * Problem Statement: 
 * Sid is obsessed with reading short stories. Being a CS student, he is doing
 * some interesting frequency analysis with the books. He chooses strings S1 and
 * S2 in such a way that |len(S1) - len(S2)| <= 1.
 * 
 * Your task is to help him find the minimum number of characters of the first
 * string he needs to change to enable him to make it an anagram of the second
 * string.
 * 
 * Note: A word x is an anagram of another word y if we can produce y by
 * rearranging the letters of x.
 * 
 * Input Format:
 * The first line will contain an integer, T, representing the number of test
 * cases. Each test case will contain a string having length len(S1)+len(S2),
 * which will be concatenation of both the strings described above in the
 * problem.The given string will contain only characters from a to z.
 * 
 * Output Format:
 * An integer corresponding to each test case is printed in a different line,
 * i.e. the number of changes required for each test case. Print -1 if it is not
 * possible.
 * 
 * Constraints: 
 * 1 <= T <= 100
 * 1 <= len(S1)+len(S2) <= 104
 * 
 * Sample Input: 
 * 6
 * aaabbb
 * ab
 * abc
 * mnop
 * xyyx
 * xaxbbbxx
 * 
 * Sample Output: 
 * 3
 * 1
 * -1
 * 2
 * 0
 * 1
 */
public class Anagrams {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            String input = sc.next();
            System.out.println(minCharsChangedForAnagram(input));
        }
        sc.close();
    }
    
    private static int minCharsChangedForAnagram(String str) {
        
        if (str.length() % 2 == 1) {
            return -1;
        }
        
        String s1 = str.substring(0, str.length() / 2);
        String s2 = str.substring(str.length() / 2);
        
        int charsRequiredToChange = 0;
        
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            chars1[s1.charAt(i) - 97]++;
            chars2[s2.charAt(i) - 97]++;
        }
        
        for (int j = 0; j < 26; j++) {
            charsRequiredToChange += (chars1[j] - chars2[j] > 0 ? chars1[j] - chars2[j] : 0);
        }
        return charsRequiredToChange;
    }
}