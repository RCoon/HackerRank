package algorithms.implementation;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * Problem Statement: 
 * Manasa is out on a hike with friends. She finds a trail of stones with
 * numbers on them. She starts following the trail and notices that two
 * consecutive stones have a difference of either a or b. Legend has it that
 * there is a treasure trove at the end of the trail and if Manasa can guess the
 * value of the last stone, the treasure would be hers. Given that the number on
 * the first stone was 0, find all the possible values for the number on the
 * last stone.
 * 
 * Note: The numbers on the stones are in increasing order.
 * 
 * Input Format:
 * The first line contains an integer T, i.e. the number of test cases. T test
 * cases follow; each has 3 lines. The first line contains n (the number of
 * stones). The second line contains a, and the third line contains b.
 * 
 * Output Format:
 * Space-separated list of numbers which are the possible values of the last
 * stone in increasing order.
 * 
 * Constraints:
 * 1 <= T <= 10
 * 1 <= n,a,b <= 103
 * 
 * Sample Input: 
 * 2
 * 3
 * 1
 * 2
 * 4
 * 10
 * 100
 * 
 * Sample Output: 
 * 2 3 4
 * 30 120 210 300
 */
public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int numStones = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            TreeSet<Integer> tSet = new TreeSet<>();
            
            for (int numDiffA = numStones - 1; numDiffA >= 0; numDiffA--) {
                int lastStoneValue = (numDiffA * a) + (((numStones - 1) - numDiffA) * b);
                tSet.add(lastStoneValue);
            }
                   
            for (int num : tSet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}