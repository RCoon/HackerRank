package algorithms.sorting;

import java.util.*;

/*
 * Problem Statement: 
 * In the previous challenges you created an Insertion Sort algorithm. It is a
 * simple sorting algorithm that works well with small or mostly sorted data.
 * However, it takes a long time to sort large unsorted data. To see why, we
 * will analyze its running time.
 * 
 * Challenge:
 * Can you modify your previous Insertion Sort implementation to keep track of
 * the number of shifts it makes while sorting? The only thing you should print
 * is the number of shifts made by the algorithm to completely sort the array. A
 * shift occurs when an element's position changes in the array. Do not shift an
 * element if it is not necessary.
 * 
 * Input Format:
 * The first line contains N, the number of elements to be sorted. The next line
 * contains N integers a[1], a[2], ..., a[N].
 * 
 * Output Format:
 * Output the number of shifts it takes to sort the array.
 * 
 * Constraints:
 * 1 <= N <= 1001
 * -10000 <= x <= 10000, x is an element of a
 * 
 * Sample Input: 
 * 5
 * 2 1 3 1 2
 * 
 * Sample Output: 
 * 4
 */
public class RunningTimeOfAlgorithms {

	public static void insertIntoSorted(int[] ar) {
		
        int numShifts = 0;
        
        for (int top = 1; top < ar.length; top++) {
			int temp = ar[top];  // copy that item into temp variable
			int pos = top - 1;
            
			while (pos >= 0 && ar[pos] > temp) {
				// move items that are bigger than temp up one position
				ar[pos+1] = ar[pos];
				pos--;
                numShifts++;
			}
			ar[pos + 1] = temp;  // place temp into last vacated position
		}
        System.out.println(numShifts);
	}
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
         in.close();
    }
}