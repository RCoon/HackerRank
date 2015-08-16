package java_problems.introduction;

import java.util.*;

/*
 * In this problem you just need to read the inputs from stdin and print them
 * in stdout.
 * Input Format:
 * There will be three lines of input. The first line will have an integer. The
 * second line will have a double number. The last line will consist of a
 * string.
 * Output Format:
 * Print the string in the first line, the double in the second line and the
 * integer in the third line. See the sample output for exact formatting.
 * 
 * Sample Input:
 * 42
 * 3.1415
 * Welcome to Hackerrank Java tutorials!
 * 
 * Note: Don't worry about the precision of the double, you can simply print
 * it using System.out.println. There might be leading or trailing spaces
 * in the string, keep it exactly as it is.
 */
public class JavaStdinStdout2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a double: ");
        double num2 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter a string: ");
        String welcome = sc.nextLine();
        
        System.out.println("String: " + welcome);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
        sc.close();
    }
}