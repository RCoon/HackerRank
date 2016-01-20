package thirty_days_of_code;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Problem Statement:
 * Given a string S, find number of words in that string. For this problem a
 * word is defined by a string of one or more English letters.
 * 
 * Note: Space or any of the special characters like [!,?.\_'@]+ will act as a
 * delimiter.
 * 
 * Input Format:
 * The string can be defined by following regular expression:
 * 
 * [A-Za-z !,?.\_'@]+
 * That means the string will only contain english letters, blank spaces and
 * this
 * special characters: [!,?.\_'@]+.
 * 
 * Constraints:
 * 1 <= |S| <= 400000
 * 
 * Output Format:
 * In the first line, print number of words in the string. The words don't need
 * to be unique. Also print each word in a separate line.
 * 
 * Sample Input: 
 * He is a very very good boy, isn't he?
 * 
 * Sample Output: 
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */
public class MoreStringMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, "[] \t\n\r\f!,?.\\_'@+");
        int numTokens = st.countTokens();

        System.out.println(numTokens);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}