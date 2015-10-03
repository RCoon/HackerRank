package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement: 
 * You are given time in AM/PM format. Convert this into a 24 hour format.
 * 
 * Note Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00PM.
 * 
 * Input Format: 
 * Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM
 * where
 * 01 <= hh <= 12
 * 00 <= mm <= 59
 * 00 <= ss <= 59
 * 
 * Output Format: 
 * You need to print the time in 24 hour format i.e. hh:mm:ss
 * where
 * 00 <= hh <= 23
 * 00 <= mm <= 59
 * 00 <= ss <= 59
 * 
 * Sample Input: 
 * 07:05:45PM
 * 
 * Sample Output: 
 * 19:05:45
 */
public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String timeString = sc.next();
		sc.close();
		
		String[] array = timeString.split(":");

		int hours = Integer.parseInt(array[0]);
		
		String amPM = array[2].substring(2);
		
		String strHours;
		String outputTime;
		
		if (amPM.equals("PM")) {
			if (hours < 12) {
				hours += 12;
			}
			
			outputTime = hours + ":" + array[1] + ":" + array[2].substring(0, 2);
		} else {
			if (hours == 12) {
				strHours = "00";
				outputTime = strHours + ":" + array[1] + ":" + array[2].substring(0, 2);
			} else {
				outputTime = array[0] + ":" + array[1] + ":" + array[2].substring(0, 2); 
			}
		}
		
		System.out.println(outputTime);
	}
}