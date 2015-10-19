package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Problem Statement: 
 * Taum is planning to celebrate the birthday of his friend, Diksha. There are
 * two types of gifts that Diksha wants from Taum: one is black and the other is
 * white. To make her happy, Taum has to buy B number of black gifts and W
 * number of white gifts.
 * 
 * The cost of each black gift is X units.
 * The cost of every white gift is Y units.
 * The cost of converting each black gift into white gift or vice versa is Z
 * units.
 * Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.
 * 
 * Input Format: 
 * The first line will contain an integer T which will be the number of test
 * cases.
 * There will be T pairs of lines. The first line of each test case will contain
 * the values of integers B and W. Another line of each test case will contain
 * the values of integers X, Y, and Z.
 * 
 * Constraints:
 * 1 <= T <= 10
 * 0 <= X,Y,Z,B,W <= 109
 * 
 * Output Format: 
 * T lines, each containing an integer: the minimum amount of units Taum needs
 * to spend on gifts.
 * 
 * Sample Input: 
 * 5
 * 10 10
 * 1 1 1
 * 5 9
 * 2 3 4
 * 3 6
 * 9 1 1
 * 7 7
 * 4 2 1
 * 3 3
 * 1 9 2
 * 
 * Sample Output: 
 * 20
 * 37
 * 12
 * 35
 * 12
 */
public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int numBlackGifts = sc.nextInt();
            int numWhiteGifts = sc.nextInt();
            int blackGiftCost = sc.nextInt();
            int whiteGiftCost = sc.nextInt();
            int conversionCost = sc.nextInt();
            
            if (blackGiftCost < whiteGiftCost) {
                if ((blackGiftCost + conversionCost) < whiteGiftCost) {
                    whiteGiftCost = blackGiftCost + conversionCost;
                }
            } else {
                if ((whiteGiftCost + conversionCost) < blackGiftCost) {
                    blackGiftCost = whiteGiftCost + conversionCost;
                }
            }

            BigInteger numBG = BigInteger.valueOf(numBlackGifts);
            BigInteger numWG = BigInteger.valueOf(numWhiteGifts);
            BigInteger bGC = BigInteger.valueOf(blackGiftCost);
            BigInteger wGC = BigInteger.valueOf(whiteGiftCost);
            
            BigInteger totalBGC = numBG.multiply(bGC);
            BigInteger totalWGC = numWG.multiply(wGC);
            
            BigInteger totalGC = totalBGC.add(totalWGC);
            
            System.out.println(totalGC.toString());
        }
        sc.close();
    }
}