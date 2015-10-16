package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given a square map of size n×n. Each cell of the map has a value
 * denoting its depth. We will call a cell of the map a cavity if and only if
 * this cell is not on the border of the map and each cell adjacent to it has
 * strictly smaller depth. Two cells are adjacent if they have a common side
 * (edge).
 * 
 * You need to find all the cavities on the map and depict them with the
 * uppercase character X.
 * 
 * Input Format: 
 * The first line contains an integer, n, denoting the size of the map. Each of
 * the following n lines contains n positive digits without spaces. Each digit
 * (1-9) denotes the depth of the appropriate area.
 * 
 * Constraints:
 * 1 <= n <= 100
 * 
 * Output Format: 
 * Output n lines, denoting the resulting map. Each cavity should be replaced
 * with character X.
 * 
 * Sample Input: 
 * 4
 * 1112
 * 1912
 * 1892
 * 1234
 * 
 * Sample Output: 
 * 1112
 * 1X12
 * 18X2
 * 1234
 */
public class CavityMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sizeOfMap = sc.nextInt();
        int[][] mapArray = new int[sizeOfMap][sizeOfMap];
       
        for (int row = 0; row < sizeOfMap; row++) {
            String number = sc.next();
    	   
    	    for (int column = 0; column < sizeOfMap; column++) {
        	    int num = 0;
        		try {
        			num = Integer.parseInt(number.substring(column, column + 1));
        		} catch (NumberFormatException e) {
        			System.out.println("Error while parsing String number.");
        		}
        		
        		mapArray[row][column] = num;
        	}
        }
        
        char[][] cavityMap = findCavities(mapArray);
        
        for (int row = 0; row < cavityMap.length; row++) {
        	for (int column = 0; column < cavityMap.length; column++) {
        		System.out.print(cavityMap[row][column]);
        	}
        	System.out.println();
        }
        sc.close();
    }
    
    private static char[][] findCavities(int[][] array) {
    	
    	boolean[][] isCavity = new boolean[array.length][array.length];
    	
    	int currDepth;
    	int above, right, below, left;
    	
    	for (int row = 1; row < array.length - 1; row++) {
    		for (int column = 1; column < array.length - 1; column++) {
    			currDepth = array[row][column];
    			above = array[row - 1][column];
    			right = array[row][column + 1];
    			below = array[row + 1][column];
    			left = array[row][column - 1];
    			
    			if (above < currDepth && right < currDepth && below < currDepth && left < currDepth) {
    				isCavity[row][column] = true;
    			}
    		}
    	}
    	
    	char[][] result = replaceCavities(array, isCavity);
    	
    	return result;
    }
    
    private static char[][] replaceCavities(int[][] array, boolean[][] cavities) {
    	
    	char[][] cavityMap = new char[array.length][array.length];
    	
    	for (int row = 0; row < array.length; row++) {
    		for (int column = 0; column < array.length; column++) {
    			if (cavities[row][column]) {
    				cavityMap[row][column] = 'X';
    			} else {
    				cavityMap[row][column] = (char)(array[row][column] + '0');
    			}
    		}
    	}
    	
    	return cavityMap;
    }
}