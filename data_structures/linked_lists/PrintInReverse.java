package data_structures.linked_lists;

import java.util.ArrayList;

/*
 * Problem Statement:
 * You are given the pointer to the head node of a linked list and you need to
 * print all its elements in reverse order from tail to head, one element per
 * line. The head pointer may be null meaning that the list is empty - in that
 * case, do not print anything!
 * 
 * Input Format:
 * You have to complete the void ReversePrint(Node* head) method which takes one
 * argument - the head of the linked list. You should NOT read any input from
 * stdin/console.
 * 
 * Output Format:
 * Print the elements of the linked list in reverse order to stdout/console
 * (using printf or cout) , one per line.
 * 
 * Sample Input: 
 * 1 --> 2 --> NULL
 * 2 --> 1 --> 4 --> 5 --> NULL
 * 
 * Sample Output: 
 * 2
 * 1
 * 5
 * 4
 * 1
 * 2
 */
public class PrintInReverse {

	void ReversePrint(Node head) {

		if (head != null) {
			ArrayList<Integer> array = new ArrayList<>();
			Node runner = head;
			while (runner != null) {
				array.add(runner.data);
				runner = runner.next;
			}
			for (int i = array.size() - 1; i >= 0; i--) {
				System.out.println(array.get(i));
			}
		}
	}
}