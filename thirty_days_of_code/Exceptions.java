package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * Create a class Calculator which consists of a single method power(int,int).
 * This method takes two integers, n and p, as parameters and finds np. If
 * either n or p is negative, then the method must throw an exception which says
 * "n and p should be non-negative".
 * 
 * Code for handling Input/Output is already provided in the editor. Please read
 * the partially completed code in the editor and complete it.
 * 
 * Note: The class Calculator mustn't be public.
 * 
 * No need to worry about constraints, there won't be any overflow if your code
 * is correct.
 * 
 * Input Format: 
 * First line contains T, the number of test cases. Next T lines contain two
 * integers n and p separated by a space.
 * 
 * Output Format: 
 * Output T lines. For each test case if n and p are positive then print np else
 * print "n and p should be non-negative" without quotes.
 * 
 * Sample Input: 
 * 4
 * 3 5
 * 2 4
 * -1 -2
 * -1 3
 * 
 * Sample Output: 
 * 243
 * 16
 * n and p should be non-negative
 * n and p should be non-negative
 */
public class Exceptions {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}

class Calculator {
    
    public int power(int n, int p) throws ArithmeticException {
        if (n < 0 || p < 0) {
            throw new ArithmeticException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}