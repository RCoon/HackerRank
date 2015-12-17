package data_structures.linked_lists;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Problem Statement:
 * You’re given the pointer to the head node of a linked list. Change the next
 * pointers of the nodes so that their order is reversed. The head pointer given
 * may be null meaning that the initial list is empty.
 * 
 * Input Format:
 * You have to complete the Node* Reverse(Node* head) method which takes one
 * argument - the head of the linked list. You should NOT read any input from
 * stdin/console.
 * 
 * Output Format:
 * Change the next pointers of the nodes that their order is reversed and return
 * the head of the reversed linked list. Do NOT print anything to
 * stdout/console.
 * 
 * Sample Input: 
 * NULL
 * 2 --> 3 --> NULL
 * 
 * Sample Output: 
 * NULL
 * 3 --> 2 --> NULL
 */
public class ReverseALinkedList {

	Node Reverse(Node head) {
		if (head == null) {
			return head;
		} else {
			Node runner = head;
			ArrayList<Integer> array = new ArrayList<>();

			while (runner != null) {
				array.add(runner.data);
				runner = runner.next;
			}

			Collections.reverse(array);
			runner = head;

			for (int num : array) {
				runner.data = num;
				runner = runner.next;
			}

			return head;
		}
	}
}