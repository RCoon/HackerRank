package thirty_days_of_code;

import java.util.regex.*;
import java.util.Scanner;

/* Problem Statement:
 * RegEx helps us easily search for or match a Pattern in text. Before searching
 * for a Pattern, we must specify it using some well-defined syntax.
 * 
 * Given a string, determine if it's a valid Pattern or not. The string may
 * contain spaces.
 * 
 * Input Format: 
 * The first line of input contains an integer, T (the number of test cases).
 * The T subsequent lines of test cases each contain a string of characters
 * describing a RegEx.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 
 * Output Format: 
 * On a new line for each test case, print Valid if the given RegEx's syntax is
 * correct; otherwise, print Invalid.
 * 
 * Sample Input: 
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 * 
 * Sample Output: 
 * Valid
 * Invalid
 * Invalid
 */
public class RegexPatternsIntroToDatabases {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}
}