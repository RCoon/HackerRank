package java_problems.data_structures;

import java.util.*;

/*
 * Some times its better to use dynamic size array, java Arraylist can provide
 * you this feature. Try to solve this problem using Arraylist.
 * 
 * You are given n lines. In each line there are zero or more integers. You need
 * to answer a few queries where you need to tell the number located in yth
 * position of xth line.
 * 
 * Take your input from System.in.
 * 
 * Input Format:
 * The first line has an integer n. In each of the next n lines there will be an
 * integer d denoting number of integers on that line and then there will be d
 * space-separated integers. In the next line there will be an integer q
 * denoting number of queries. Each query will consist of two integers x and y.
 * 
 * Constraints
 * 
 * 1<=n<=20000
 * 0<=d<=50000
 * 1<=q<=1000
 * 1<=x,y<=n
 * 
 * Each number will fit in signed integer.
 * Total number of integers in n lines will not cross 100000.
 * 
 * Output Format:
 * In each line, output the number located in yth position of xth line. If there
 * is no such position, just print "ERROR!"
 * 
 * Sample Input:
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 */
public class JavaArrayList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            int numColumns = sc.nextInt();
            ArrayList<Integer> columns = new ArrayList<>(numColumns);
            for (int j = 0; j < numColumns; j++) {
                int num = sc.nextInt();
                columns.add(num);
            }
            rows.add(columns);
        }
        int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (rows.get(x).size() > y) {
                System.out.println(rows.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}