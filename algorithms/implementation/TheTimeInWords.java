package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement: 
 * Given the time in numerals we may convert it into words, as shown below:
 * 
 * 5:00 --> five o' clock
 * 5:01 --> one minute past five
 * 5:10 --> ten minutes past five
 * 5:30 --> half past five
 * 5:40 --> twenty minutes to six
 * 5:45 --> quarter to six
 * 5:47 --> thirteen minutes to six
 * 5:28 --> twenty eight minutes past five
 * 
 * Write a program which prints the time in words for the input given in the
 * format mentioned above.
 * 
 * Input Format: 
 * There will be two lines of input:
 * H, representing the hours
 * M, representing the minutes
 * 
 * Constraints:
 * 1 <= H < 12
 * 0 <= M < 60
 * 
 * Output Format: 
 * Display the time in words.
 * 
 * Sample Input: 
 * 5
 * 47
 * 
 * Sample Output: 
 * thirteen minutes to six
 */
public class TheTimeInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		sc.close();

		String hour = convertHourToWord(hours);

		if (minutes == 0 || minutes == 15 || minutes == 30 || minutes == 45) {
			switch (minutes) {
			case 0:
				System.out.println(hour + " o' clock");
				break;
			case 15:
				System.out.println("quarter past " + hour);
				break;
			case 30:
				System.out.println("half past " + hour);
				break;
			case 45:
				if (hours == 12) {
					hour = convertHourToWord(1);
				} else {
					hour = convertHourToWord(hours + 1);
				}

				System.out.println("quarter to " + hour);
				break;
			}

		} else if (minutes == 1) {
			System.out.println(convertMinuteToWord(minutes) + " minute past "
							+ hour);
		} else if (minutes < 30) {
			System.out.println(convertMinuteToWord(minutes) + " minutes past "
							+ hour);
		} else {
			if (hours == 12) {
				hour = convertHourToWord(1);
			} else {
				hour = convertHourToWord(hours + 1);
			}

			if (minutes == 59) {
				System.out.println(convertMinuteToWord(60 - minutes)
								+ " minute to " + hour);
			} else {
				System.out.println(convertMinuteToWord(60 - minutes)
								+ " minutes to " + hour);
			}
		}

	}

	private static String convertHourToWord(int hour) {

		switch (hour) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		default:
			return "twelve";
		}
	}

	private static String convertMinuteToWord(int minute)
					throws NumberFormatException {

		if (minute < 20) {
			return convertLowMins(minute);
		} else if (minute == 20) {
			return "twenty";
		} else {
			String number = minute + "";
			String convertedToWord = "twenty ";
			String ones = number.substring(1);
			int onesPlace = Integer.parseInt(ones);
			convertedToWord += convertLowMins(onesPlace);

			return convertedToWord;
		}
	}

	private static String convertLowMins(int mins) {

		switch (mins) {
		case 0:
			return "";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		default:
			return "nineteen";
		}
	}
}