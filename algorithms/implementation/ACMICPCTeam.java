package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given a list of N people who are attending ACM-ICPC World Finals.
 * Each of them are either well versed in a topic or they are not. Find out the
 * maximum number of topics a 2-person team can know. And also find out how many
 * teams can know that maximum number of topics.
 * 
 * Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are
 * counted as two different teams.
 * 
 * Input Format: 
 * The first line contains two integers, N and M, separated by a single space,
 * where N represents the number of people, and M represents the number of
 * topics. N lines follow.
 * Each line contains a binary string of length M. If the ith line's jth
 * character is 1, then the ith person knows the jth topic; otherwise, he
 * doesn't know the topic.
 * 
 * Constraints:
 * 2 <= N <= 500
 * 1 <= M <= 500
 * 
 * Output Format: 
 * On the first line, print the maximum number of topics a 2-person team can
 * know.
 * On the second line, print the number of 2-person teams that can know the
 * maximum number of topics.
 * 
 * Sample Input: 
 * 4 5
 * 10101
 * 11100
 * 11010
 * 00101
 * 
 * Sample Output: 
 * 5
 * 2
 */
public class ACMICPCTeam {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// no of people
		int N = in.nextInt();

		// no of topic
		int M = in.nextInt();

		char[][] t = new char[N][M];

		// each persons's topic data
		for (int i = 0; i < N; i++) {
			t[i] = in.next().toCharArray();
		}
		in.close();

		// convert to int type for "OR" operation
		int[][] p = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				p[i][j] = (int) (t[i][j] - '0');
			}
		}

		// map for storing teams data
		Map<Integer, Integer> hmap = new HashMap<>();

		int count = 0;
		int max = 0;

		for (int i = 0; i < N; i++) {
			// first person
			int[] a = p[i];
			for (int j = i + 1; j < N; j++) {
				// second person
				int[] b = p[j];
				count = 0;
				// "OR" operation and count total number of "1"
				for (int k = 0; k < M; k++) {
					if ((a[k] | b[k]) == 1)
						count++;
				}
				// new MAX found , previous max and map data will be removed
				if (count > max) {
					max = count;
					hmap.clear();
					hmap.put(i, j);
					// same as max , count
				} else if (count == max) {
					hmap.put(i, j);
				}
			}
		}

		// max number of "OR"
		System.out.println(max);
		// number of team who meet "max"
		System.out.println(hmap.size());

	}
}