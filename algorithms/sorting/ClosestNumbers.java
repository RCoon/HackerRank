package algorithms.sorting;

import java.util.*;

/*
 * Sorting is often useful as the first step in many different tasks. The most
 * common task is to make finding things easier, but there are other uses, as
 * well.
 * 
 * Challenge:
 * Given a list of unsorted integers, A={a1,a2,...,aN}A={a1,a2,...,aN}, can you find
 * the pair of elements that have the smallest absolute difference between them?
 * If there are multiple pairs, find them all.
 * 
 * Input Format:
 * The first line of input contains a single integer, N, representing the
 * length of array A.
 * In the second line, there are N space-separated integers,
 * a1,a2,...,aN representing the elements of array A.
 * 
 * Output Format:
 * Output the pairs of elements with the smallest difference. If there are
 * multiple pairs, output all of them in ascending order, all on the same line
 * (consecutively) with just a single space between each pair of numbers. If
 * there's a number which lies in two pair, print it two times (see the sample
 * case #3 for explanation).
 * 
 * Constraints: 
 * 2 <= N <= 200000
 * -10^7 <= ai <= 10^7
 * ai does not equal aj, where 1 <= i < j <= N
 * 
 * Sample Input #1: 
 * 10
 * -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
 * 
 * Sample Output #1: 
 * -20 30
 */
public class ClosestNumbers {

    public static class Pair {
        public int a;
        public int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>(size);
        
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        List<Pair> pairs = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 1; i < size; i++) {
            int a = list.get(i);
            int b = list.get(i - 1);
            int diff = a - b;
            diff = (diff < 0) ? -diff : diff;
            
            if (diff < minDifference) {
                minDifference = diff;
                pairs.clear();
                pairs.add(new Pair(b, a));
            } else if (diff == minDifference) {
                pairs.add(new Pair(b, a));
            }
        }
        
        for (Pair p : pairs) {
            System.out.print(p.a + " " + p.b + " ");
        }
        sc.close();
    }
}