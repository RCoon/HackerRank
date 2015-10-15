package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement
 * 
 * Julius Caesar protected his confidential information from his enemies by
 * encrypting it. Caesar rotated every letter in the string by a fixed number K.
 * This made the string unreadable by the enemy. You are given a string S and
 * the number K. Encrypt the string and print the encrypted string.
 * 
 * For example:
 * If the string is middle-Outz and K=2, the encoded string is okffng-Qwvb. Note
 * that only the letters are encrypted while symbols like - are untouched.
 * 'm' becomes 'o' when letters are rotated twice,
 * 'i' becomes 'k',
 * '-' remains the same because only letters are encoded,
 * 'z' becomes 'b' when rotated twice.
 * 
 * Input Format: 
 * Input consists of an integer N equal to the length of the string, followed by
 * the string S and an integer K.
 * 
 * Constraints:
 * 1 <= N <= 100
 * 0 <= K <= 100
 * S is a valid ASCII string and doesn't contain any spaces.
 * 
 * Output Format: 
 * For each test case, print the encoded string.
 * 
 * Sample Input: 
 * 11
 * middle-Outz
 * 2
 * 
 * Sample Output: 
 * okffng-Qwvb
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stringLength = sc.nextInt();
        String input = sc.next();
        int shift = sc.nextInt();
        
        shift = shift % 26;
        sc.close();
        
        System.out.println(encodeString(input, shift));      
    }
    
    private static String encodeString(String str, int shift) {
        String message = str;
        int numShift = shift;
        
        String result = "";
        int length = message.length();
        for (int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            if (ch >= 'A' && ch <= 'Z' && ch + numShift < 65) {
                numShift += 'Z' - 'A' + 1;
                ch += numShift;
            } else if (ch >= 'A' && ch <= 'Z' && ch + numShift > 90) {
                numShift -= 'Z' - 'A' + 1;
                ch += numShift;
            } else if (ch >= 'a' && ch <= 'z' && ch + numShift < 97) {
                numShift += 'z' - 'a' + 1;
                ch += numShift;
            } else if (ch >= 'a' && ch <= 'z' && ch + numShift > 122) {
                numShift -= 'z' - 'a' + 1;
                ch += numShift;
            } else if (!Character.isLetter(ch)) {
                // Keep non-letter characters the same
            } else {
                ch += numShift;
            }
            result += ch;
        }
		return result;
	}
}