package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * An English text needs to be encrypted using the following encryption scheme.
 * First, the spaces are removed from the text. Let L be the length of this
 * text.
 * Then, characters are written into a grid, whose rows and columns have the
 * following constraints:
 * 
 * floor(sqrt(L)) <= rows <= column <= ceil(sqrt(L)).
 * For example, the sentence "if man was meant to stay on the ground god would
 * have given us roots", after removing spaces is 54 characters long, so it is
 * written in the form of a grid with 7 rows and 8 columns.
 * 
 * ifmanwas
 * meanttos
 * tayonthe
 * groundgo
 * dwouldha
 * vegivenu
 * sroots
 * 
 * Ensure that rows x columns >= L
 * If multiple grids satisfy the above conditions, choose the one with the
 * minimum area, i.e. rows x columns.
 * The encoded message is obtained by displaying the characters in a column,
 * inserting a space, and then displaying the next column and inserting a space,
 * and so on. For example, the encoded message for the above rectangle is:
 * 
 * imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
 * 
 * You will be given a message in English with no spaces between the words. The
 * maximum message length can be 81 characters. Print the encoded message.
 * 
 * Here are some more examples:
 * 
 * Sample Input: 
 * haveaniceday
 * 
 * Sample Output: 
 * hae and via ecy
 */
public class Encryption {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String message = sc.next();
		sc.close();
		
		int rows = (int) Math.floor(Math.sqrt(message.length()));
		int columns = (int) Math.ceil(Math.sqrt(message.length()));
		
		if (rows * columns < message.length()) {
			rows += 1;
		}
		
		char[][] array = new char[rows][columns];
		
		int charCount = 0;
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				if (charCount < message.length()) {
					array[i][j] = message.charAt(charCount);
					charCount++;
				}
			}
		}
		
		//printCharArray(array);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < columns; i++) {
			if (i > 0) {
				sb.append(' ');
			}
			for (int j = 0; j < rows; j++) {
				if (array[j][i] != 0) {
					sb.append(array[j][i]);
				}
			}
		}
		
		System.out.println(sb.toString());
	}
	
	private static void printCharArray(char[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}