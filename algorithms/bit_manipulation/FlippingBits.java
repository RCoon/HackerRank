package algorithms.bit_manipulation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You will be given a list of 32 bits unsigned integers. You are required to
 * output the list of the unsigned integers you get by flipping bits in its
 * binary representation (i.e. unset bits must be set, and set bits must be
 * unset).
 * 
 * Input Format: 
 * The first line of the input contains the list size T, which is followed by T
 * lines, each line having an integer from the list.
 * 
 * Constraints: 
 * 1 <= T <= 100
 * 0 <= integer < 232
 * 
 * Output Format: 
 * Output one line per element from the list with the requested result.
 * 
 * Sample Input: 
 * 3
 * 2147483647
 * 1
 * 0
 * 
 * Sample Output: 
 * 2147483648
 * 4294967294
 * 4294967295
 */
public class FlippingBits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            System.out.println(sc.nextLong() ^ 4294967295L);
        }
        sc.close();
    }
}