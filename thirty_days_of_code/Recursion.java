package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * Euclid's Algorithm for Computing the GCD of two integers
 * 
 * Given two integers, x and y, their GCD (greatest common divisor) can be
 * calculated recursively using Euclid's Algorithm, which essentially says that
 * if x equals y, then GCD(x,y)=x; otherwise, GCD(x,y)=GCD(x-y,y) if x>y. Note
 * that this logic can be further optimized for a more efficient implementation.
 * 
 * Given the starter code in your editor, complete the function body so it
 * returns the GCD of two input integers, x and y.
 * 
 * Input Format: 
 * Two space-separated integers, x and y.
 * 
 * Constraints:
 * 1 <= x,y <= 106
 * 
 * Output Format: 
 * Print the GCD of x and y as an integer.
 * 
 * Sample Input: 
 * 1 5
 * 
 * Sample Output: 
 * 1
 */
public class Recursion {

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd = find_gcd(a,b);
        System.out.println(gcd);
        sc.close();
    }
    
    static  int find_gcd(int a, int b){
        
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return find_gcd(b, a % b);
        }
        return find_gcd(a, b % a);
    }
}