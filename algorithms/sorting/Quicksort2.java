package algorithms.sorting;

import java.util.*;
import java.util.stream.*;

/*
 * Problem Statement: 
 * In the previous challenge, you wrote a partition method to split an array
 * into two sub-arrays, one containing smaller elements and one containing
 * larger elements than a given number. This means you 'sorted' half the array
 * with respect to the other half. Can you repeatedly use partition to sort an
 * entire array?
 * 
 * Guideline:
 * In Insertion Sort, you simply went through each element in order and inserted
 * it into a sorted sub-array. In this challenge, you cannot focus on one
 * element at a time, but instead must deal with whole sub-arrays, with a
 * strategy known as "divide and conquer".
 * 
 * When partition is called on an array, two parts of the array get 'sorted'
 * with respect to each other. If partition is then called on each sub-array,
 * the array will now be split into four parts. This process can be repeated
 * until the sub-arrays are small. Notice that when partition is called on just
 * one numbers, they end up being sorted.
 * 
 * Can you repeatedly call partition so that the entire array ends up sorted?
 * 
 * Print Sub-Arrays
 * In this challenge, print your array every time your partitioning method
 * finishes, i.e. whenever two subarrays, along with the pivot, is merged
 * together.
 * 
 * The first element in a sub-array should be used as a pivot.
 * Partition the left side before partitioning the right side.
 * The pivot should be placed between sub-arrays while merging them.
 * Array of length 1 or less will be considered sorted, and there is no need to
 * sort or to print them.
 * Note
 * Please maintain the original order of the elements in the left and right
 * partitions while partitioning around a pivot element.
 * 
 * For example: Partition about the first element for the array A[]={5, 8, 1, 3,
 * 7, 9, 2} will be {1, 3, 2, 5, 8, 7, 9}
 * 
 * Input Format:
 * There will be two lines of input:
 * 
 * n - the size of the array
 * ar - the n numbers of the array
 * 
 * Output Format:
 * Print every partitioned sub-array on a new line.
 * 
 * Constraints:
 * 1 <= n <= 1000
 * -1000 <= x <= 1000,x is an element of ar
 * Each number is unique.
 * 
 * Sample Input: 
 * 7
 * 5 8 1 3 7 9 2
 * 
 * Sample Output: 
 * 2 3
 * 1 2 3
 * 7 8 9
 * 1 2 3 5 7 8 9
 */
public class Quicksort2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numElements = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < numElements; i++) {
            array.add(sc.nextInt());
        }
        sc.close();
        partition(array);
    }
    
    private static ArrayList<Integer> partition(ArrayList<Integer> arr) {
        
        if (arr.size() < 2) {
            return arr;
        }
        Integer pivot = arr.remove(0);
        
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        for (Integer num : arr) {
            if (num < pivot) {
                left.add(num);
            } else {
                right.add(num);
            }
        }
        
        ArrayList<Integer> sorted = partition(left);
        sorted.add(pivot);
        sorted.addAll(partition(right));
        
        printArrayList(sorted.stream());
        
        return sorted;
    }
    
    private static void printArrayList(Stream<Integer> s) {
        
        System.out.println(s.map(t->Integer.toString(t)).collect(Collectors.joining(" ")));
    }
}