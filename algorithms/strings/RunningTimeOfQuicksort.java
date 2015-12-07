package algorithms.strings;

import java.util.*;

/*
 * Challenge:
 * In practice, how much faster is Quicksort (in-place) than Insertion Sort?
 * Compare the running time of the two algorithms by counting how many swaps or
 * shifts each one takes to sort an array, and output the difference. You can
 * modify your previous sorting code to keep track of the swaps. The number of
 * swaps required by Quicksort to sort any given input have to be calculated.
 * Keep in mind that the last element of a block is chosen as the pivot, and
 * that the array is sorted in-place as demonstrated in the explanation below.
 * 
 * Any time a number is lower than the partition, it should be "swapped", even
 * if it doesn't actually move to a different location. Also ensure that you
 * count the swap when the pivot is moved into place. The count for Insertion
 * Sort should be the same as the previous challenge, where you just count the
 * number of "shifts".
 * 
 * Note
 * Please use Lomuto Partition for this challenge.
 * 
 * Input Format:
 * There will be two lines of input:
 * 
 * n - the size of the array
 * ar - n numbers that make up the array
 * Output Format
 * Output one integer D, where D= (insertion sort shifts) - (quicksort swaps)
 * 
 * Constraints:
 * 1 <= n <= 1000
 * -1000 <= x <= 1000,x is an element of ar
 * 
 * Sample Input: 
 * 7
 * 1 3 9 8 2 7 5
 * 
 * Sample Output: 
 * 1
 */
public class RunningTimeOfQuicksort {

	private static int shifts = 0;
    private static int swaps = 0;
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int numElements = sc.nextInt();
        
        int[] array = new int[numElements];
        
        for (int i = 0; i < array.length; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }
        int[] arrayCopy = array.clone();
        
        insertionSort(array);
        quickSort(arrayCopy, 0, arrayCopy.length - 1);

        System.out.println(shifts - swaps);
        sc.close();
    }
    
    private static void insertionSort(int[] arr) {
        
        for (int top = 1; top < arr.length; top++) {
			int temp = arr[top];
			int pos = top - 1;
            
			while (pos >= 0 && arr[pos] > temp) {
				arr[pos+1] = arr[pos];
				pos--;
                shifts++;
			}
			arr[pos + 1] = temp;
		}
    }
    
    private static void quickSort(int[] arr, int begin, int end) {
        
        if (begin >= end) return;
        int p = partition(arr, begin, end);
        quickSort(arr, begin, p-1);
        quickSort(arr, p+1, end);
    }
    
    private static int partition(int[] arr, int begin, int end) {
        
        int v = arr[end];
        int p = begin;
        for (int i = begin; i < end; ++i) {
            if (arr[i] < v) {
                swap(arr, p++, i);
            }
        }
        swap(arr, p, end);
        return p;
    }
    
    private static void swap(int[] arr, int i, int j) {
        swaps++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}