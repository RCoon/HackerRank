package java_problems.introduction;

import java.util.*;

/*
 * In most of the Hackerrank challenges, you need to read input from stdin
 * (standard input) and write your output in stdout (standard output).
 * One way to take input from stdin is to use Scanner class and reading from
 * System.in.
 * You can write your output to stdout simply using System.out.printf function.
 * In this problem you need to read 3 integers from stdin and print them in
 * stdout.
 * 
 * Sample input: 42 100 125
 */
public class JavaStdinStdout1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}