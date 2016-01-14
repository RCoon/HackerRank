package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * In this challenge, you will create a program that takes N non-negative
 * integers as input and finds the greatest absolute difference between two of
 * the N integers, and then print this difference to the console.
 * 
 * There is a class Difference given in the editor with one private instance
 * array elements which stores the N non negative integers and public integer
 * maxDifference to store the greatest absolute difference between the two of
 * the N integers.
 * 
 * Code for handling input/output is already given in the editor. Your task is
 * to write the constructor for the class Difference and the method
 * computeDifference which finds the greatest absolute difference between any
 * two numbers in the input array and stores it in maxDifference.
 * 
 * Input Format: 
 * First line contains an integer N representing size of the array. Next line
 * contains N integers separated by space.
 * 
 * Constraints:
 * 1 <= N <= 10
 * 1 <= elements[i] <= 100 where 1 <= i <= N
 * 
 * Output Format: 
 * Output the the greatest absolute difference between two of N integers in the
 * array.
 * 
 * Sample Input: 
 * 3
 * 1 2 5
 * 
 * Sample Output: 
 * 4
 */
public class AllAboutScope {

  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];
    
    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

      	Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
        sc.close();
   }
}

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
    Difference (int[] array) {
        elements = array;
        maximumDifference = computeDifference();
    }

    public int computeDifference() {
        int maxDiff = 0;
        if (elements.length > 1) {
            for (int i = 0; i < elements.length - 1; i++) {
                int currDiff;
                for (int j = i + 1; j < elements.length; j++) {
                    currDiff = Math.abs(elements[i] - elements[j]);
                    if (currDiff > maxDiff) {
                        maxDiff = currDiff;
                    }
                }
            }
        }
        return maxDiff;
    }
}