package algorithms.sorting;

import java.util.*;

/*
 * Problem Statement: 
 * The previous challenges covered Insertion Sort, which is a simple and
 * intuitive sorting algorithm. Insertion Sort has a running time of O(N2) which
 * isn't fast enough for most purposes. Instead, sorting in the real world is
 * done with faster algorithms like Quicksort, which will be covered in the
 * challenges that follow.
 * 
 * The first step of Quicksort is to partition an array into two smaller arrays.
 * 
 * Challenge:
 * You're given an array ar and a number p. Partition the array, so that all
 * elements greater than p are to its right, and all elements smaller than p are
 * to its left. p is called the pivot of the partition.
 * 
 * Guideline - In this challenge, you do not need to move around the numbers
 * 'in-place'. This means you can create two lists and combine them at the end.
 * 
 * Input Format:
 * You will be given an array of integers. The number p is the first element in
 * ar.
 * 
 * There are two lines of input:
 * 
 * n - the number of elements in the array ar
 * the n elements of ar (including p at the beginning)
 * 
 * Output Format:
 * Print out the numbers of the partitioned array on one line.
 * 
 * Constraints: 
 * 1 <= n <= 1000
 * -1000 <= x <= 1000,x is an element of ar
 * All elements will be unique.
 * Multiple answer can exists for the given test case. Print any one of them.
 * 
 * Sample Input: 
 * 5
 * 4 5 3 7 2
 * 
 * Sample Output: 
 * 3 2 4 5 7
 */
public class Quicksort1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numElements = sc.nextInt();
        int pivot = sc.nextInt();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for (int i = 1; i < numElements; i++) {
            int num = sc.nextInt();
            
            if (num < pivot) {
                left.add(num);
            } else {
                right.add(num);
            }
        }
        sc.close();
        
        int[] array = new int[numElements];
        int index = 0;
        for (int n : left) {
            array[index] = n;
            index++;
        }
        
        array[index] = pivot;
        index++;
        
        for (int n : right) {
            array[index] = n;
            index++;
        }
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}