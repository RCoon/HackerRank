package java_problems.java_contests;

import java.util.*;

public class FindRobot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cases: ");
        int numCases = sc.nextInt();
        System.out.println("Enter " + numCases + " test cases:");
        for (int i = 0; i < numCases; i++) {
            int numTurns = sc.nextInt();
            int[] coordinates = findRobot(numTurns);
            System.out.println(coordinates[0] + " " + coordinates[1]);
        }
        sc.close();
    }
    
    public static int[] findRobot(int turns) {
        int x = 0;
        int y = 0;
        int[] coords = new int[2];
        boolean right = true;
        boolean up = true;
        for (int numTurns = 1; numTurns <= turns; numTurns++) {
            if (numTurns % 2 == 1) {
                if (right) {
                    x += numTurns;
                    right = false;
                } else {
                    x -= numTurns;
                    right = true;
                }
            } else {
                if (up) {
                    y += numTurns;
                    up = false;
                } else {
                    y -= numTurns;
                    up = true;
                }
            }
        }
        coords[0] = x;
        coords[1] = y;
        return coords;
    }
}
