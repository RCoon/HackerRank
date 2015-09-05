package java_problems.data_structures;

import java.util.*;

/*
 * Problem Statement:
 * A string containing only parentheses is balanced if the following is true:
 * 
 * if it is an empty string
 * if A and B are correct, AB is correct,
 * if A is correct, (A) and {A} and [A] are also correct.
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * Given a string, determine if it is balanced or not.
 * 
 * Input Format:
 * There will be multiple lines in the input file, each having a single
 * non-empty string. You should read input till end-of-file.
 * The part of the code that handles input operation is already provided in the
 * editor.
 * 
 * Output Format:
 * For each case, print 'true' if the string is balanced, 'false' otherwise.
 * 
 * Sample Input:
 * {}()
 * ({()})
 * {}(
 * []
 * 
 * Sample Output:
 * true
 * true
 * false
 * true
 */
public class JavaStack {

	public static void main(String[] args) {
		   
        Scanner sc = new Scanner(System.in);
        int countLeftCurly;
        int countLeftParen;
        int countLeftBracket;
        int countRightCurly;
        int countRightParen;
        int countRightBracket;  
       
        while (sc.hasNext()) {
            String input=sc.next();
            countLeftCurly = 0;
            countLeftParen = 0;
            countLeftBracket = 0;
            countRightCurly = 0;
            countRightParen = 0;
            countRightBracket = 0;
            for (int i = 0; i < input.length(); i++) {
                char next = input.charAt(i);
                switch (next) {
                    case '(':
                        countLeftParen++;
                        break;
                    case '{':
                        countLeftCurly++;
                        break;
                    case '[':
                        countLeftBracket++;
                        break;
                    case ')':
                        countRightParen++;
                        break;
                    case '}':
                        countRightCurly++;
                        break;
                    case ']':
                        countRightBracket++;
                        break;
                    default:
                        System.out.println("Unexpected character " + next + ".");
                }
            }
            if (countLeftParen == countRightParen && countLeftCurly == countRightCurly &&
                countLeftBracket == countRightBracket) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}