package data_structures.linked_lists;

/*
 * Problem Statement:
 * You’re given the pointer to the head node of a doubly linked list. Reverse
 * the order of the nodes in the list. The head node might be NULL to indicate
 * that the list is empty.
 * 
 * Input Format:
 * You have to complete the Node* Reverse(Node* head) method which takes one
 * argument - the head of the doubly linked list. You should NOT read any input
 * from stdin/console.
 * 
 * Output Format:
 * Change the next and prev pointers of all the nodes so that the direction of
 * the list is reversed. Then return the head node of the reversed list. Do NOT
 * print anything to stdout/console.
 * 
 * Sample Input: 
 * NULL
 * NULL <-- 2 <--> 4 <--> 6 --> NULL
 * 
 * Sample Output: 
 * NULL
 * NULL <-- 6 <--> 4 <--> 2 --> NULL
 */
public class ReverseDoublyLinkedList {

	DNode Reverse(DNode head) {
	    if (head != null) {
	        DNode runner = head;
	        DNode temp = head;
	        
	        while (runner != null) {
	            temp = runner.prev;
	            
	            runner.prev = runner.next;
	            runner.next = temp;
	            
	            runner = runner.prev;
	        }
	        
	        if (temp != null) {
	            head = temp.prev;
	        }
	    }
	    return head;
	}
}