package algorithms.sorting;

import java.util.Scanner;

/*
 * Insert element into sorted list:
 * Given a sorted list with an unsorted number V in the rightmost cell, can you
 * write some simple code to insert V into the array so that it remains sorted?
 * 
 * Print the array every time a value is shifted in the array until the array is
 * fully sorted. The goal of this challenge is to follow the correct order of
 * insertion sort.
 * 
 * Guideline: You can copy the value of V to a variable and consider its cell
 * "empty". Since this leaves an extra cell empty on the right, you can shift
 * everything over until V can be inserted. This will create a duplicate of each
 * value, but when you reach the right spot, you can replace it with V.
 * 
 * Input Format
 * There will be two lines of input:
 * 
 * s - the size of the array
 * ar - the sorted array of integers
 * Output Format
 * On each line, output the entire array every time an item is shifted in it.
 * 
 * Constraints:
 * 1 <= s <= 1000
 * -10000 <= V <= 10000,V is an element of ar
 * 
 * Sample Input:
 * 5
 * 2 4 6 8 3
 * 
 * Sample Output:
 * 2 4 6 8 8
 * 2 4 6 6 8
 * 2 4 4 6 8
 * 2 3 4 6 8
 */
public class InsertionSortPartOne {

	public static void insertIntoSorted(int[] ar) {
		for (int top = 1; top < ar.length; top++) {
			int temp = ar[top];  // copy that item into temp variable
			int pos = top - 1;
			while (pos >= 0 && ar[pos] > temp) {
				// move items that are bigger than temp up one position
				ar[pos+1] = ar[pos];
				pos--;
                printArray(ar);
			}
			ar[pos + 1] = temp;  // place temp into last vacated position
		}
        printArray(ar);
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
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}