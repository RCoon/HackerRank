package algorithms.search;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Sunny and Johnny together have M dollars they want to spend on ice cream. The
 * parlor offers N flavors, and they want to choose two flavors so that they end
 * up spending the whole amount.
 * 
 * You are given the cost of these flavors. The cost of the ith flavor is
 * denoted by ci. You have to display the indices of the two flavors whose sum
 * is M.
 * 
 * Input Format: 
 * The first line of the input contains T; T test cases follow.
 * Each test case follows the format detailed below: The first line contains M.
 * The second line contains N. The third line contains N space-separated
 * integers denoting the price of each flavor. Here, the ith integer denotes ci.
 * 
 * Output Format: 
 * Output two integers, each of which is a valid index of a flavor. The lower
 * index must be printed first. Indices are indexed from 1 to N.
 * 
 * Constraints: 
 * 1 <= T <= 50
 * 2 <= M <= 10000
 * 2 <= N <= 10000
 * 1 <= ci <= 10000, where i is an element of [1,N]
 * 
 * The prices of any two items may be the same and each test case has a unique
 * solution.
 * 
 * Sample Input: 
 * 2
 * 4
 * 5
 * 1 4 5 3 2
 * 4
 * 4
 * 2 2 4 3
 * 
 * Sample Output: 
 * 1 4
 * 1 2
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int dollarsToSpend = sc.nextInt();
            int numFlavors = sc.nextInt();
            int[] flavorPrices = new int[numFlavors];
            
            for (int j = 0; j < numFlavors; j++) {
                flavorPrices[j] = sc.nextInt();
            }
            int[] array = findIndices(flavorPrices, dollarsToSpend);
            System.out.println(array[0] + " " + array[1]);
        }
        sc.close();
    }
    
    private static int[] findIndices(int[] priceOfFlavors, int moneyToSpend) {
        
        int[] indicesWithSumEqualToFunds = new int[2];
        
        for (int i = 0; i < priceOfFlavors.length - 1; i++) {
            for (int j = i + 1; j < priceOfFlavors.length; j++) {
                if (priceOfFlavors[i] + priceOfFlavors[j] == moneyToSpend) {
                    indicesWithSumEqualToFunds[0] = i + 1;
                    indicesWithSumEqualToFunds[1] = j + 1;
                }
            }
        }
        
        return indicesWithSumEqualToFunds;
    }
}