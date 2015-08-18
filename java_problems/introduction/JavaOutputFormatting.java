package java_problems.introduction;

/*
 * Take exactly 3 lines of input. Each line consists of a string and an
 * integer.  The strings will have at most 10 alphabetic characters and the
 * integers will range between 0 to 999.
 * 
 * In each line of output there should be two columns. The string should be in
 * the first column and the integer in the second column.
 * 
 * The first column should be left justified using exactly 15 characters. The
 * integer of the second column should have exactly 3 digits. If the original
 * input has less than 3 digits, you should pad with zeros to the left.
 * 
 * Sample input:
 * 
 * java 100
 * cpp 65
 * python 50
 */
import java.util.*;

public class JavaOutputFormatting {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
        	String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d %n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}