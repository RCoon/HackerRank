package thirty_days_of_code;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Problem Statement:
 * A palindrome is a "word, phrase, number, or other sequence of characters which
 * reads the same backwards and forwards." Can you determine if a given string, s,
 * is a palindrome?
 * 
 * To solve this challenge, we must first take each character in s, enqueue it
 * in a queue, and also push it onto a stack. Once that's done, we must dequeue
 * the first character from the queue and pop the top character off the stack,
 * then compare the two characters to see if they are the same; as long as the
 * characters match, we continue dequeueing, popping, and comparing each
 * character until our containers are empty (a non-match means s isn't a
 * palindrome).
 * 
 * Write the following four functions/methods in class Palindrome:
 * 
 * void pushCharacter(char ch): Pushes a character onto a stack.
 * void enqueueCharacter(char ch): Enqueues a character in a queue.
 * char popCharacter(): Pops and returns the top character.
 * char dequeueCharacter(): Dequeues and returns the first character.
 * Code handling Input/Output and determining if s is palindrome is provided in
 * the editor.
 * 
 * Input Format: 
 * A single line containing string s.
 * 
 * Note: s will always be lowercase.
 * 
 * Output Format: 
 * If s is a palindrome, print "The word, s, is a palindrome."
 * Otherwise, print "The word, s, is not a palindrome." without quotes
 * 
 * Sample Input: 
 * racecar
 * 
 * Sample Output: 
 * The word, racecar, is a palindrome.
 */
public class QueuesAndStacks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Palindrome p = new Palindrome();
		char arr[] = s.toCharArray();

		for (char c : arr) {
			p.pushCharacter(c);
		}

		for (char c : arr) {
			p.enqueueCharacter(c);
		}

		boolean f = true;

		for (int i = 0; i < s.length(); i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				f = false;
				break;
			}
		}

		if (f) {
			System.out.println("The word, " + s + ", is a palindrome.");
		} else {
			System.out.println("The word, " + s + ", is not a palindrome.");
		}
		sc.close();
	}
}

class Palindrome {
    
    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    
    public void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }
    
    public char popCharacter() {
        return stack.pop();
    }
    
    public char dequeueCharacter() {
        return queue.removeFirst();
    }
}