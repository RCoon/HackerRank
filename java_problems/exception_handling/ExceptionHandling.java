package java_problems.exception_handling;

import java.util.*;

/*
 * Problem Statement: * 
 * Create a class myCalculator which consists of a single method power(int,int).
 * This method takes two integers, n and p, as parameters and finds np. If
 * either n or p is negative, then the method must throw an exception which
 * says "n and p should be non-negative".
 * 
 * Please read the partially completed code in the editor and complete it. Your
 * code mustn't be public.
 * 
 * No need to worry about constraints, there won't be any overflow if your code
 * is correct.
 * 
 * Sample Input:
 * 3 5
 * 2 4
 * -1 -2
 * -1 3
 * 
 * Sample Output:
 * 243
 * 16
 * java.lang.Exception: n and p should be non-negative
 * java.lang.Exception: n and p should be non-negative
 */
public class ExceptionHandling {
	
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        in.close();
    }
}

class myCalculator {
    
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else if (p == 0) {
            return 1;
        } else {
            int result = n;
            for (int i = 2; i <= p; i++) {
                result *= n;
            }
            return result;
        }
    }
}