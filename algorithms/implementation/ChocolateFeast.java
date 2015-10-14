package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Little Bob loves chocolate, and he goes to a store with $N in his pocket. The
 * price of each chocolate is $C. The store offers a discount: for every M
 * wrappers he gives to the store, he gets one chocolate for free. How many
 * chocolates does Bob get to eat?
 * 
 * Input Format:
 * The first line contains the number of test cases, T.
 * T lines follow, each of which contains three integers, N, C, and M.
 * 
 * Output Format:
 * Print the total number of chocolates Bob eats.
 * 
 * Constraints:
 * 1 <= T <= 1000
 * 2 <= N <= 105
 * 1 <= C <= N
 * 2 <= M <= N
 * 
 * Sample input: 
 * 3
 * 10 2 5
 * 12 4 4
 * 6 2 2
 * 
 * Sample Output: 
 * 6
 * 3
 * 5
 */
public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for (int i = 0; i < numCases; i++) {
			int totalFunds = sc.nextInt();
			int pricePerChocolate = sc.nextInt();
			int wrappersForFreeChocolate = sc.nextInt();

			int numChocolatesPurchased = totalFunds / pricePerChocolate;

			int numExtraChocolates = numFreeChocolatesFromWrappers(
				numChocolatesPurchased, wrappersForFreeChocolate, 0);

			System.out.println(numChocolatesPurchased + numExtraChocolates);
		}
		sc.close();
	}

	private static int numFreeChocolatesFromWrappers(int chocolatesPurchased,
					int wrappersForFreeChocolate, int totalFreeChocolates) {

		int additionalFreeChocolates = (chocolatesPurchased / wrappersForFreeChocolate);

		int leftOverWrappers = (chocolatesPurchased % wrappersForFreeChocolate);

		totalFreeChocolates += additionalFreeChocolates;

		if ((additionalFreeChocolates
						+ leftOverWrappers) < wrappersForFreeChocolate) {
			
			return totalFreeChocolates;
		} else {
			return numFreeChocolatesFromWrappers(
							additionalFreeChocolates + leftOverWrappers,
							wrappersForFreeChocolate, totalFreeChocolates);
		}
	}
}