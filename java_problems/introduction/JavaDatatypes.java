package java_problems.introduction;

import java.util.*;
import java.math.*;

/*
 * Given an integer number, you have to determine which of these datatypes you
 * can use to store that number. If there are multiple suitable datatypes, list
 * them all in the order above.
 * The first line will contain an integer T, which denotes the number of inputs
 * that will follow. Each of the next T lines will contain an integer n. The
 * number can be arbitrarily large or small!
 * For each n, list all the datatypes it can be fitted into ordered by the size
 * of the datatype. If it can't be fitted into any of these datatypes, print
 * "n can't be fitted anywhere."
 * 
 * Sample input:
 * 5 -150 150000 1500000000 213333333333333333333333333333333333 
 * -100000000000000
 */
public class JavaDatatypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Enter an integer number of inputs T, followed " +
            "by T integers: ");
        int numInputs = in.nextInt();
        String middle = "";
        for (int i = 0; i < numInputs; i++) {
        	input = in.next();
            try {
                if (input.length() < 0 || input.length() > 20) {
                    System.out.println(input + " can't be fitted anywhere.");
                } else {
                    if (fitsInByte(Long.valueOf(input))) middle += "\n* byte";
                    if (fitsInShort(Long.valueOf(input))) middle += "\n* short";
                    if (fitsInInt(Long.valueOf(input))) middle += "\n* int";
                    if (fitsInLong(Long.valueOf(input))) middle += "\n* long";
                    System.out.println(input + " can be fitted in:" + middle);
                    middle = "";
                }
            }
            catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        in.close();
    }    
    
    public static Boolean fitsInByte(Long num) {
        if (num >= -128 && num <= 127) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Boolean fitsInShort(Long num) {
        if (num >= -32768 && num <= 32767) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Boolean fitsInInt(Long num) {
        if (num >= -2147483648 && num <= 2147483647) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Boolean fitsInLong(Long num) {
        BigInteger number = BigInteger.valueOf(num.longValue());
        BigInteger min = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger max = BigInteger.valueOf(Long.MAX_VALUE);
        if (number.compareTo(max) <= 0 && number.compareTo(min) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}