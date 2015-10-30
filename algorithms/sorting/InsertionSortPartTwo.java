package algorithms.sorting;

import java.util.Scanner;

/*
 * Problem Statement: 
 * In Insertion Sort Part 1, you sorted one element into an array. Using the
 * same approach repeatedly, can you sort an entire unsorted array?
 * 
 * Guideline: You already can place an element into a sorted array. How can you
 * use that code to build up a sorted array, one element at a time? Note that in
 * the first step, when you consider an element with just the first element -
 * that is already "sorted" since there's nothing to its left that is smaller.
 * 
 * In this challenge, don't print every time you move an element. Instead, print
 * the array after each iteration of the insertion-sort, i.e., whenever the next
 * element is placed at its correct position.
 * 
 * Since the array composed of just the first element is already "sorted", begin
 * printing from the second element and on.
 * 
 * Input Format:
 * There will be two lines of input:
 * 
 * s - the size of the array
 * ar - a list of numbers that makes up the array
 * 
 * Output Format:
 * On each line, output the entire array at every iteration.
 * 
 * Constraints:
 * 1 <= s <= 1000
 * -10000 <= x <= 10000, x is an element of ar
 * 
 * Sample Input: 
 * 6
 * 1 4 3 5 6 2
 * 
 * Sample Output: 
 * 1 4 3 5 6 2
 * 1 3 4 5 6 2
 * 1 3 4 5 6 2
 * 1 3 4 5 6 2
 * 1 2 3 4 5 6
 */
public class InsertionSortPartTwo {

    public static void insertionSortPart2(int[] ar)
    {       
        int itemsSorted;
        
        for (itemsSorted = 1; itemsSorted < ar.length; itemsSorted++) {
            int temp = ar[itemsSorted];
            int loc = itemsSorted - 1;
            
            while (loc >= 0 && ar[loc] > temp) {
                ar[loc + 1] = ar[loc];
                loc = loc - 1;
            }
            
            ar[loc + 1] = temp;
            printArray(ar);
        }
    }  
    
    
      
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);
       in.close();
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}