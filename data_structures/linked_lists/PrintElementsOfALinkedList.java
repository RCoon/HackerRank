package data_structures.linked_lists;

/*
 * Input Format:
 * You have to complete the void Print(Node* head) method which takes one
 * argument: the head of the linked list. You should not read any input from
 * stdin/console. The struct Node has a data part which stores the data and a
 * next pointer which points to the next element of the linked list. There are
 * multiple test cases. For each test case, this method will be called
 * individually.
 * 
 * Output Format:
 * Print the elements of the linked list to stdout/console (using printf or
 * cout). Print one per line.
 * 
 * Sample Input: 
 * NULL
 * 1->2->3->NULL
 * 
 * Sample Output: 
 * 1
 * 2
 * 3
 */
public class PrintElementsOfALinkedList {

	void Print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}

class Node {
	int data;
	Node next;
}