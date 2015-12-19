package data_structures.linked_lists;

import java.util.*;

/*
 * Problem Statement:
 * You’re given the pointer to the head nodes of two sorted linked lists. The
 * data in both lists will be sorted in ascending order. Change the next
 * pointers to obtain a single, merged linked list which also has data in
 * ascending order. Either head pointer given may be null meaning that the
 * corresponding list is empty.
 * 
 * Input Format:
 * You have to complete the Node* MergeLists(Node* headA, Node* headB) method
 * which takes two arguments - the heads of the two sorted linked lists to
 * merge. You should NOT read any input from stdin/console.
 * 
 * Output Format:
 * Change the next pointer of individual nodes so that nodes from both lists are
 * merged into a single list. Then return the head of this merged list. Do NOT
 * print anything to stdout/console.
 * 
 * Sample Input: 
 * 1 -> 3 -> 5 -> 6 -> NULL
 * 2 -> 4 -> 7 -> NULL
 * 
 * 15 -> NULL
 * 12 -> NULL
 * 
 * NULL
 * 1 -> 2 -> NULL
 * 
 * Sample Output: 
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
 * 12 -> 15 -> NULL
 * 1 -> 2 -> NULL
 */
public class MergeTwoSortedLinkedLists {

	Node MergeLists(Node headA, Node headB) {

	    Node runnerA = headA;
	    Node runnerB = headB;
	 
	    ArrayList<Integer> arrayA = new ArrayList<>();
	    ArrayList<Integer> arrayB = new ArrayList<>();
	    
	    while (runnerA != null) {
	        arrayA.add(runnerA.data);
	        runnerA = runnerA.next;
	    }
	    
	    while (runnerB != null) {
	        arrayB.add(runnerB.data);
	        runnerB = runnerB.next;
	    }
	    
	    arrayA.addAll(arrayB);
	    Collections.sort(arrayA);
	    
	    Node head = new Node();
	    head.data = arrayA.get(0);
	    
	    Node runner = head;
	    
	    for (int i = 1; i < arrayA.size(); i++) {
	        Node newNode = new Node();
	        newNode.data = arrayA.get(i);
	        runner.next = newNode;
	        runner = runner.next;
	    }
	    
	    return head;
	}
}