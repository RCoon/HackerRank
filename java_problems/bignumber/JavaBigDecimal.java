package java_problems.bignumber;

import java.math.BigDecimal;
import java.util.*;

/*
 * Java BigDecimal class can handle arbitrary-precision signed decimal numbers.
 * Lets test your knowledge on them!  You are given n real numbers, sort them
 * in descending order! Read data from System.in.
 * 
 * Note: You should take input as string, convert it to BigDecimal and print it
 * using System.out.println after sorting without changing anything.
 * 
 * Input Format: 
 * The first line will consist an integer n, each of the next n lines will
 * contain a real number. n will be at most 200. The numbers can have at most
 * 300 digits!
 * 
 * Output Format: 
 * Print the numbers in descending orders, one number in each line.
 * 
 * Sample Input:
 * 5
 * -100
 * 50
 * 0
 * 56.6
 * 90
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer amount of numbers to "
        				 + "input:\n> ");
        int numLines = sc.nextInt();
        if (numLines > 1) {
            System.out.print("Enter " + numLines + " numbers, each followed "
         				       + "by a space:\n> ");
        } else {
            System.out.print("Enter a number:\n> ");
        }
        BigDecimal bd;
        String number, bdNumber;
        ArrayList<BigDecimal> array = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            number = sc.next();
            bd = new BigDecimal(number);
            array.add(bd);
        }
        Collections.sort(array);
        Collections.reverse(array);
        for (BigDecimal bigD : array) {
            bdNumber = bigD.toPlainString().replaceFirst("^0\\.", ".");
            System.out.println(bdNumber);
        }
        sc.close();
    }
}