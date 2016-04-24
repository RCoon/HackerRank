package intro_to_statistics;

import java.util.*;

public class Warmup {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("%.1f%n", getMean(arr));
        System.out.printf("%.1f%n", getMedian(arr));
        System.out.println(getMode(arr));
        System.out.printf("%.1f%n", getStandardDeviation(arr));
        sc.close();
    }
    
    private static double getMean(int[] arr) {
        double total = 0;
        for (int num : arr) {
            total += num;
        }
        return total / arr.length;
    }
    
    private static double getMedian(int[] arr) {
        
        if (arr.length % 2 == 1) {
            return (double) arr[arr.length / 2];
        } else {
            return (double) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
    }
    
    public static int getMode(int[] input) {
        int returnVal = input[0]; // stores element to be returned
        int repeatCount = 0; // counts the record number of repeats
        int prevRepCnt = 0; // temporary count for repeats
        int lowerValue = Integer.MAX_VALUE; // initalize it with the highest integer value - 2147483647

        for (int i=0; i<input.length; i++) { // goes through each elem

            for (int j=i; j<input.length; j++) { // compares to each elem after the first elem

                if (i != j && input[i] == input[j]) { // if matching values
                    repeatCount++; // gets the repeat count

                    if (repeatCount>prevRepCnt) { // a higher count of repeats than before
                        returnVal=input[i]; // return that element
                        lowerValue = returnVal; // set the variable lowerValue to be the lower value
                    } else if ((repeatCount == prevRepCnt) && (input[i] < lowerValue)) {
                        returnVal=input[i]; // return that element
                        lowerValue = returnVal; // set the variable lowerValue to be the lower value
                    }
                    prevRepCnt = repeatCount; // Keeps the highest repeat record
                }
                repeatCount=0; // resets repeat Count for next comparison
            }
        }
        return returnVal;
    }
    
    private static double getStandardDeviation(int[] arr) {
        double mean = getMean(arr);
        double totalNumerator = 0;
        for (int num : arr) {
            double diff = num - mean;
            totalNumerator += diff * diff;
        }
        return Math.sqrt(totalNumerator / arr.length);
    }
}