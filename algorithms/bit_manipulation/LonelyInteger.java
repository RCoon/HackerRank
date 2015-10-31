package algorithms.bit_manipulation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * There are N integers in an array A. All but one integer occur in pairs. Your
 * task is to find the number that occurs only once.
 * 
 * Input Format: 
 * The first line of the input contains an integer N, indicating the number of
 * integers. The next line contains N space-separated integers that form the
 * array A.
 * 
 * Constraints: 
 * 1 <= N < 100
 * N % 2=1 (N is an odd number)
 * 0 <= A[i] <= 100, every i is an element of [1,N]
 * 
 * Output Format: 
 * Output S, the number that occurs only once.
 * 
 * Sample Input:1 
 * 1
 * 1
 * 
 * Sample Output:1 
 * 1
 * 
 * Sample Input:2 
 * 3
 * 1 1 2
 * 
 * Sample Output:2 
 * 2
 * 
 * Sample Input:3 
 * 5
 * 0 0 1 2 1
 * 
 * Sample Output:3 
 * 2
 */
public class LonelyInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numInts = sc.nextInt();
        
        int a = 0;
        
        for (int i = 0; i < numInts; i++) {
            int num = sc.nextInt();
            a ^= num;
        }
        System.out.println(a);
        sc.close();
    }
}