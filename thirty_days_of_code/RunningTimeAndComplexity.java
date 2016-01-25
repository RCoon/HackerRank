package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * In this challenge, you will determine if a given number X is prime or not. A
 * prime number is a natural number greater than 1 that has no positive divisors
 * other than 1 and itself. You will be given N numbers and for each, you will
 * print out "Prime" if the number is prime or "Not prime" if the number is not
 * prime.
 * 
 * If this is too easy, create a method that decides if X is prime or not in
 * O(sqrt(X)) time. Think modulos and square root! If you are having trouble, try
 * creating an O(X) time algorithm and see whether it solves the problem or not.
 * 
 * To review Big-O Notation, remember...
 * 
 * Big-O is used in Computer Science to describe the performance or complexity of an algorithm."
 * Big-O specifically describes the worst-case scenario, and can be used to describe
 * the execution time required or the space used (e.g. in memory or on disk) by an algorithm."
 * 
 * Input Format: 
 * The first line of the input is T, total number of test cases. Each of the
 * next line contains an integer N.
 * 
 * Constraints: 
 * 1 <= T <= 20
 * 1 <= N <= 2x10^9
 * 
 * Output Format: 
 * For each test case print Prime if N is prime, otherwise print Not prime.
 * 
 * Sample Input: 
 * 3
 * 12
 * 5
 * 7
 * 
 * Sample Output: 
 * Not prime
 * Prime
 * Prime
 */
public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            System.out.println(checkPrime(sc.nextInt()));
        }
        sc.close();
    }
    
    static String checkPrime(int num) {
        boolean isPrime = true;
        
        primeCheckLoop:
        for (int i = 2; i * i < num; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break primeCheckLoop;
            }
        }
        if (num > 1 && isPrime) {
            return "Prime";
        } else {
            return "Not prime";
        }
    }
}