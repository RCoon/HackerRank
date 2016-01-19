package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * Here you are given an interface AdvancedArithmetic which contains a method
 * signature
 * 
 * int divisorSum(int n). (The divisorSum function just takes an integer as
 * input and return the sum of all its divisors.) 
 * Your only task is to write a class Calculator which implements the interface.
 * 
 * Note : The class Calculator shouldn't be public.
 * 
 * Input Format: 
 * Only one line containing integer n
 * 
 * Constraints:
 * 1 <= n <= 1000
 * 
 * Output Format: 
 * In the first line print "I implemented: AdvancedArithmetic" without quotes.
 * In the next line print the sum of divisors of n as given in problem
 * statement.
 * 
 * Sample Input: 
 * 6
 * 
 * Sample Output: 
 * I implemented: AdvancedArithmetic
 * 12
 */
public class Interfaces {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new DivisorCalculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
        sc.close();
    }
}

class DivisorCalculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        
        int maxDivisor = (int) Math.sqrt(n);
        int sum = 0;
        
        for (int i = 1; i <= maxDivisor; i++) {
            if (n % i == 0) {
                sum += i;
                
                int d = n / i;
                if (d != i) {
                    sum += d;
                }
            }
        }
        return sum;
    }
}

interface AdvancedArithmetic {
	int divisorSum(int n);
}