package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Sherlock Holmes is getting paranoid about Professor Moriarty, his arch-enemy.
 * All his efforts to subdue Moriarty have been in vain. These days Sherlock is
 * working on a problem with Dr. Watson. Watson mentioned that the CIA has been
 * facing weird problems with their supercomputer, 'The Beast', recently.
 * 
 * This afternoon, Sherlock received a note from Moriarty, saying that he has
 * infected 'The Beast' with a virus. Moreover, the note had the number N
 * printed on it. After doing some calculations, Sherlock figured out that the
 * key to remove the virus is the largest Decent Number having N digits.
 * 
 * A Decent Number has the following properties: 
 * 3, 5, or both as its digits. No other digit is allowed.
 * Number of times 3 appears is divisible by 5.
 * Number of times 5 appears is divisible by 3.
 * Meanwhile, the counter to the destruction of 'The Beast' is running very
 * fast. Can you save 'The Beast', and find the key before Sherlock?
 * 
 * Input Format:
 * The 1st line will contain an integer T, the number of test cases. This is
 * followed by T lines, each containing an integer N. i.e. the number of digits
 * in the number.
 * 
 * Output Format:
 * Largest Decent Number having N digits. If no such number exists, tell
 * Sherlock that he is wrong and print -1.
 * 
 * Constraints:
 * 1 <= T <= 20
 * 1 <= N <= 100000
 * 
 * Sample Input: 
 * 4
 * 1
 * 3
 * 5
 * 11
 * 
 * Sample Output: 
 * -1
 * 555
 * 33333
 * 55555533333
 */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
        	int numDigits = sc.nextInt();
        	
        	System.out.println(highestDecentNumber(numDigits));
        }
        sc.close();
    }
    
    static String highestDecentNumber(int numberOfDigits) {
    	
    	StringBuilder highest = new StringBuilder();
    	int numFives;
    	
    	if (numberOfDigits % 3 == 0) {
    		highest.append(concatDigits(numberOfDigits, "5"));
    	} else if (numberOfDigits < 3) {
    		highest.append("-1");
    	} else {
    		numFives = maxFives(numberOfDigits);
    		
    		if (numFives == 0) {
    			if (numberOfDigits % 5 == 0) {
    				highest.append(concatDigits(numberOfDigits, "3"));
    			} else {
    				highest.append("-1");
    			}
    		} else {
    			int numThrees = numberOfDigits - numFives;
        		
        		highest.append(concatDigits(numFives, "5"));
        		highest.append(concatDigits(numThrees, "3"));
    		}
    	}
    	
    	return highest.toString();
    }
    
    static String concatDigits(int digitsToAdd, String number) {
    	
    	StringBuilder numberString = new StringBuilder(digitsToAdd);
    	
    	for (int i = 0; i < digitsToAdd; i++) {
    		numberString.append(number);
    	}
    	
    	return numberString.toString();
    }
    
    static int maxFives(int numberOfDigits) {
    	
    	int fives = 0;
    	
    	if (numberOfDigits <= 0) {
    		return fives;
    	} else if (numberOfDigits % 3 == 0) {
    		fives = numberOfDigits;
    		return fives;
    	} else {
    		return maxFives(numberOfDigits - 5);
    	}
    }
}