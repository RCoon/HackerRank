package data_structures.arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
 * There are N strings. Each string's length is no more than 20 characters.
 * There are also Q queries. For each query, you are given a string, and you
 * need to find out how many times this string occurred previously.
 * 
 * Input Format: 
 * The first line contains N, the number of strings.
 * The next N lines each contain a string.
 * The N+2nd line contains Q, the number of queries.
 * The following Q lines each contain a query string.
 * 
 * Constraints: 
 * 1 <= N <= 1000
 * 1 <= Q <= 1000
 * 1 <= length of any string <= 20
 * 
 * Sample Input: 
 * 4
 * aba
 * baba
 * aba
 * xzxb
 * 3
 * aba
 * xzxb
 * ab
 * 
 * Sample Output: 
 * 2
 * 1
 * 0
 */
public class SparseArrays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        
        int numStrings = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numStrings; i++) {
            String str = sc.nextLine();

            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int count = map.get(str);
                map.replace(str, count, count + 1);
            }
        }
        
        int numQueries = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numQueries; i++) {
            String str = sc.nextLine();
            if (map.containsKey(str)) {
                System.out.println(map.get(str));
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}