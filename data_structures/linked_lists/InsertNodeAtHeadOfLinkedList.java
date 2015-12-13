package data_structures.linked_lists;

/*
 * Problem Statement:
 * You’re given the pointer to the head node of a linked list and an integer to
 * add to the list. Create a new node with the given integer, insert this node
 * at the head of the linked list and return the new head node. The head pointer
 * given may be null meaning that the initial list is empty.
 * 
 * Input Format:
 * You have to complete the Node* Insert(Node* head, int data) method which
 * takes two arguments - the head of the linked list and the integer to insert.
 * You should NOT read any input from stdin/console.
 * 
 * Output Format:
 * Insert the new node at the head and return the head of the updated linked
 * list. Do NOT print anything to stdout/console.
 * 
 * Sample Input: 
 * NULL , data = 1
 * 1 --> NULL , data = 2
 * 
 * Sample Output: 
 * 1 --> NULL
 * 2 --> 1 --> NULL
 */
public class InsertNodeAtHeadOfLinkedList {

	Node Insert(Node head,int x) {
	    
	    Node newNode = new Node();
	    newNode.data = x;
	    
	    if (head == null) {
	        newNode.next = null;
	    } else {
	        newNode.next = head;
	    }
	    head = newNode;
	    
	    return head;
	}
}