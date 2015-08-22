package java_problems.strings;

import java.util.*;

/*
 * Given a string, find number of words in that string. For this problem a word
 * is defined by a string of one or more english alphabets.
 * 
 * There are multiple ways to tokenize a string in java, learn how to tokenize
 * a string in java and demonstrate your skill by solving this problem!
 * 
 * Input Format:
 * A string not more than 400000 characters long. The string can be defined by
 * following regular expression:
 * [A-Za-z !,?.\_'@]+
 * That means the string will only contain english alphabets, blank spaces and
 * this characters: "!,?._'@".
 * 
 * Output Format:
 * In the first line, print number of words n in the string. The words don't
 * need to be unique. In the next n lines, print all the words you found in the
 * order they appeared in the input.
 * 
 * Sample Input:
 * He is a very very good boy, isn't he?
 */
public class JavaStringToken {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count and display the tokens: ");
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(
        							input, " \t\n\r\f!,?._'@");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        sc.close();
    }
}