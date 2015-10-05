package algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given an integer N. Print the factorial of this number.
 * 
 * N!=Nx(N-1)x(N-2)x...x3x2x1
 * Note: Factorials of N>20 can't be stored even in a 64-bit long long variable.
 * Big integers must be used for such calculations. Languages like Java, Python,
 * Ruby etc. can handle big integers but we need to write additional code in
 * C/C++ to handle such large values.
 * 
 * We recommend solving this challenge using BigIntegers.
 * 
 * Input Format:
 * Input consists of a single integer N.
 * 
 * Constraints:
 * 1 <= N <= 100
 * 
 * Output Format:
 * Output the factorial of N.
 * 
 * Sample Input:
 * 25
 * 
 * Sample Output: 
 * 15511210043330985984000000
 */
public class ExtraLongFactorials {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        calculateAndPrintFactorial(number);
    }
    
    static void calculateAndPrintFactorial(int num) {
        
        BigInteger result = BigInteger.ONE;
        
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}