package thirty_days_of_code;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Problem Statement:
 * Sorting is an important basic algorithmic concept used to organize data so
 * coders can better solve problems. You may find our interactive article on
 * widely-used sorting algorithms and this article on Insertion Sort helpful in
 * solving today's problem.
 * 
 * The absolute difference between two integers, a and b, is |a-b|. The minimum
 * absolute difference between two integers in a list A of positive integers, is
 * the smallest absolute difference between any two integers in A.
 * 
 * Given a list A={a0,a1,...,aN-1} of unsorted integers, find and print the pair
 * (or pairs) of elements having the minimum absolute difference.
 * 
 * Note: More than one pair of elements may have the same absolute difference.
 * 
 * Input Format: 
 * The first line contains a single integer N, denoting the length of list A.
 * The second line contains N space-separated integers, a0,a1,...,aN-1,
 * representing the elements in A.
 * 
 * Constraints: 
 * 2 < N <= 2x10^5
 * -10^7 <= Ai <= 10^7
 * Ai != Aj,where 0 <= i < j <= N-1
 * 
 * Output Format: 
 * Print the space-separated pair of elements having the minimum absolute
 * difference in ascending order. If more than one pair meets this criterion,
 * print them consecutively, separated by a space, in ascending order on a
 * single line. Because we are printing space-separated pairs, some elements may
 * appear more than once in your output.
 * 
 * Sample Input: 
 * 10
 * -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
 * 
 * Sample Output 1: 
 * -20 30
 */
public class Sorting {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int listLength = sc.nextInt();
        int[] array = new int[listLength];
        
        for (int i = 0; i < listLength; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        ArrayList<Integer> minDiffPairs = new ArrayList<>();
        int minAbsDiff = Integer.MAX_VALUE;
        
        for (int j = 1; j < array.length; j++) {
            int currAbsDiff = array[j] - array[j-1];
            if (currAbsDiff < minAbsDiff) {
                minAbsDiff = currAbsDiff;
                minDiffPairs.clear();
                minDiffPairs.add(array[j-1]);
                minDiffPairs.add(array[j]);
            } else if (currAbsDiff == minAbsDiff) {
                minDiffPairs.add(array[j-1]);
                minDiffPairs.add(array[j]);
            }
        }
        for (int num : minDiffPairs) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}