package data_structures.linked_lists;

import java.util.ArrayList;

/*
 * Problem Statement:
 * You’re given the pointer to the head node of a linked list. Find whether the
 * list contains any cycle (or loop). A linked list is said to contain cycle if
 * any node is re-visited while traversing the list. The head pointer given may
 * be null meaning that the list is empty.
 * 
 * Input Format:
 * You have to complete the int HasCycle(Node* head) method which takes one
 * argument - the head of the linked list. You should NOT read any input from
 * stdin/console. Number of nodes in a linked list doesn't exceed 100.
 * 
 * Output Format:
 * Check whether the linked list has a cycle and return 1 if there is a cycle.
 * Otherwise, return 0. Do NOT print anything to stdout/console.
 * 
 * Sample Input: 
 * 1 --> NULL
 * 
 * 1 --> 2 --> 3
 * ^ |
 * | |
 * -----
 * 
 * Sample Output: 
 * 0
 * 1
 */
public class DetectCycle {

	int HasCycle(Node head) {

	    if (head == null) {
	        return 0;
	    } else {
	        ArrayList<Node> array = new ArrayList<>();
	        Node runner = head;
	        
	        while (runner != null) {
	            array.add(runner);
	            for (Node n : array) {
	                if (runner.next == n) {
	                    return 1;
	                }
	            }
	            runner = runner.next;
	        }
	        return 0;
	    }
	}
}