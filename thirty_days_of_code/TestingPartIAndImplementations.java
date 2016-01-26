package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement: 
 * The Head Librarian at a library wants you to make a program that calculates
 * the fine for returning the book after the return date. You are given the
 * actual and the expected return dates. Calculate the fine as follows:
 * 
 * If the book is returned on or before the expected return date, no fine will
 * be charged, in other words fine is 0.
 * 
 * If the book is returned in the same calendar month as the expected return
 * date, Fine = 15 Hackos × Number of late days
 * 
 * If the book is not returned in the same calendar month but in the same
 * calendar year as the expected return date, Fine = 500 Hackos × Number of late
 * months
 * 
 * If the book is not returned in the same calendar year, the fine is fixed at
 * 10000 Hackos.
 * 
 * Input Format: 
 * You are given the actual and the expected return dates in D M Y format
 * respectively. There are two lines of input. The first line contains the D M Y
 * values for the actual return date and the next line contains the D M Y values
 * for the expected return date.
 * 
 * Constraints:
 * 1 <= D <= 31
 * 1 <= M <= 12
 * 1 <= Y <= 3000
 * 
 * Output Format: 
 * Output a single value equal to the fine.
 * 
 * Sample Input:
 * 9 6 2015
 * 6 6 2015
 * 
 * Sample Output: 
 * 45
 */
public class TestingPartIAndImplementations {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String actualReturnDateString = sc.nextLine();
        String expectedReturnDateString = sc.nextLine();
        
        sc.close();
        
        String[] actualReturnDate = actualReturnDateString.split(" ");
        String[] expectedReturnDate = expectedReturnDateString.split(" ");
        
        int actualReturnYear = Integer.parseInt(actualReturnDate[2]);
        int expectedReturnYear = Integer.parseInt(expectedReturnDate[2]);
        int actualReturnMonth = Integer.parseInt(actualReturnDate[1]);
        int expectedReturnMonth = Integer.parseInt(expectedReturnDate[1]);
        int actualReturnDay = Integer.parseInt(actualReturnDate[0]);
        int expectedReturnDay = Integer.parseInt(expectedReturnDate[0]);
        
        int fineAmount;
        
        if (actualReturnYear > expectedReturnYear) {
            fineAmount = 10000;
        } else if (actualReturnYear < expectedReturnYear) {
        	fineAmount = 0;
        } else if (actualReturnMonth > expectedReturnMonth) {
            fineAmount = 500 * (actualReturnMonth - expectedReturnMonth);
        } else if (actualReturnMonth < expectedReturnMonth) {
        	fineAmount = 0;
        } else if (actualReturnDay > expectedReturnDay) {
            fineAmount = 15 * (actualReturnDay - expectedReturnDay);
        } else {
        	fineAmount = 0;
        }
       
        System.out.println(fineAmount);
    }
}
