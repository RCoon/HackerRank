package java_problems.introduction;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

/*
 * You are given a date. Your task is to find what the day is on that date.
 * 
 * Input Format: 
 * A single line of input containing the space separated month, day and year,
 * respectively, in format.
 * 
 * Constraints:
 * 2000 < year < 3000
 * 
 * Output Format: 
 * Output the correct day in capital letters.
 * 
 * Sample Input: 
 * 08 05 2015
 * 
 * Sample Output
 * WEDNESDAY
 */
public class JavaDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(day + "/" + month + "/" + year, formatter);
        DayOfWeek dow = date.getDayOfWeek();
        System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.US).toUpperCase());
        in.close();
    }
}