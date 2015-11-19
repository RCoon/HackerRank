package algorithms.strings;

import java.util.*;

/*
 * Problem Statement: 
 * You are given two strings, A and B. Find if there is a substring that appears
 * in both A and B.
 * 
 * Input Format: 
 * Several test cases will be given to you in a single file. The first line of
 * the input will contain a single integer T, the number of test cases.
 * 
 * Then there will be T descriptions of the test cases. Each description
 * contains two lines. The first line contains the string A and the second line
 * contains the string B.
 * 
 * Output Format: 
 * For each test case, display YES (in a newline), if there is a common
 * substring. Otherwise, display NO.
 * 
 * Constraints: 
 * All the strings contain only lowercase Latin letters.
 * 1 <= T <= 10
 * 1 <= |A|,|B| <= 105
 * 
 * Sample Input: 
 * 2
 * hello
 * world
 * hi
 * world
 * 
 * Sample Output: 
 * YES
 * NO
 */
public class TwoStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            HashSet<Character> chars = new HashSet<>();
            
            char[] str1ToChars = str1.toCharArray();
            for (int j = 0; j < str1ToChars.length; j++) {
                chars.add(new Character(str1ToChars[j]));
            }
            
            boolean commonChar = false;
            int index = 0;
            
            while (index < str2.length()) {
                if (chars.contains(str2.charAt(index))) {
                    commonChar = true;
                    break;
                }
                index++;
            }
            if (commonChar) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}