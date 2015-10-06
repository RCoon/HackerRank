package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * The professor is conducting a course on Discrete Mathematics to a class of N
 * students. He is angry at the lack of their discipline, and he decides to
 * cancel the class if there are fewer than K students present after the class
 * starts.
 * 
 * Given the arrival time of each student, your task is to find out if the class
 * gets cancelled or not.
 * 
 * Input Format: 
 * The first line of the input contains T, the number of test cases. Each test
 * case contains two lines.
 * The first line of each test case contains two space-separated integers, N and
 * K.
 * The next line contains N space-separated integers, a1,a...,aN, representing
 * the arrival time of each student.
 * 
 * If the arrival time of a given student is a non-positive integer (ai <= 0),
 * then the student enters before the class starts. If the arrival time of a
 * given student is a positive integer (ai > 0), the student enters after the
 * class has started.
 * 
 * Output Format: 
 * For each testcase, print "YES" (without quotes) if the class gets cancelled
 * and "NO" (without quotes) otherwise.
 * 
 * Constraints: 
 * 1 <= T <= 10
 * 1 <= N <= 1000
 * 1 <= K <= N
 * -100 <= ai <= 100, where i is an element of [1,N]
 * Note
 * If a student enters the class exactly when it starts (ai = 0), the student is
 * considered to have entered before the class has started.
 * 
 * Sample Input: 
 * 2
 * 4 3
 * -1 -3 4 2
 * 4 2
 * 0 -1 2 1
 * 
 * Sample Output: 
 * YES
 * NO
 */
public class AngryProfessor {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int studentCount = sc.nextInt();
            int onTimeStudentsRequiredForClass = sc.nextInt();
            
            int numOnTimeStudents = studentCount;
            
            for (int j = 0; j < studentCount; j++) {
                int minutesLate = sc.nextInt();
                
                if (minutesLate > 0) {
                    numOnTimeStudents--;
                }
            }
            
            if (numOnTimeStudents < onTimeStudentsRequiredForClass) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}