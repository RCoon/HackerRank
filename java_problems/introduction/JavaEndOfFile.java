package java_problems.introduction;

import java.util.*;

/*
 * Sometimes you don't know how many lines are there in a file and you need to
 * read the file until EOF or End-of-file. In this problem you need to read a
 * file until EOF and print the contents of the file. You must take input from
 * stdin(System.in).
 * 
 * Input Format:
 * 
 * Each line will contain a non-empty string. Read until EOF.
 * 
 * Output Format:
 * 
 * For each line, print the line number followed by a single space and the line
 * content.
 * 
 * Sample Input:
 * 
 * Hello world
 * I am a file
 * Read me until end-of-file.
 */
public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = 0;
        while (sc.hasNext()) {
            System.out.println(++lineNum + " " + sc.nextLine());
        }
        sc.close();
    }
}