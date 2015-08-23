package java_problems.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * In this problem you have to add and multiply huge numbers! These numbers are
 * so big that you can't contain them in any ordinary data types like long
 * integer.  Use the power of Java's BigInteger class and solve this problem.
 * 
 * Input Format:
 * There will be two lines containing two numbers, a and b. The numbers are
 * non-negative and can have maximum 200 digits.
 * 
 * Output Format:
 * Output two lines. The first line should contain a+b, and the second line
 * should contain a×b. Don't print any leading zeros.
 * 
 * Sample Input:
 * 1234
 * 20
 */
public class JavaBigInteger {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two non-negative numbers:\n> ");
        	BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
        sc.close();
    }
}