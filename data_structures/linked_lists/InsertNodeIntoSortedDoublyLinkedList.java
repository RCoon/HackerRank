package data_structures.linked_lists;

/*
 * Problem Statement:
 * You’re given the pointer to the head node of a sorted doubly linked list and
 * an integer to insert into the list. Create a node and insert it into the
 * appropriate position in the list. The head node might be NULL to indicate
 * that the list is empty.
 * 
 * Input Format:
 * You have to complete the Node* SortedInsert(Node* head, int data) method
 * which takes two arguments - the head of the sorted, doubly linked list and
 * the value to insert. You should NOT read any input from stdin/console.
 * 
 * Output Format:
 * Create a node with the given data and insert it into the given list, making
 * sure that the new list is also sorted. Then return the head node of the
 * updated list. Do NOT print anything to stdout/console.
 * 
 * Sample Input: 
 * NULL , data = 2
 * NULL <-- 2 <--> 4 <--> 6 --> NULL , data = 5
 * 
 * Sample Output: 
 * NULL <-- 2 --> NULL
 * NULL <-- 2 <--> 4 <--> 5 <--> 6 --> NULL
 */
public class InsertNodeIntoSortedDoublyLinkedList {

	DNode SortedInsert(DNode head,int data) {
	    DNode newNode = new DNode();
	    newNode.data = data;
	    
	    if (head == null) {
	        head = newNode;
	        newNode.next = null;
	        newNode.prev = null;
	        return head;
	    } else if (data <= head.data) {
	        newNode.next = head;
	        newNode.prev = null;
	        head = newNode;
	        return head;
	    } else {
	        DNode runner = head;
	        
	        while (runner.next != null) {
	            if (data <= runner.next.data) {
	                runner.next.prev = newNode;
	                newNode.next = runner.next;
	                runner.next = newNode;
	                return head;
	            }
	            runner = runner.next;
	        }
	        runner.next = newNode;
	        newNode.prev = runner;
	        newNode.next = null;
	        
	        return head;
	    }
	}
}

class DNode {
	int data;
	DNode next;
	DNode prev;
}