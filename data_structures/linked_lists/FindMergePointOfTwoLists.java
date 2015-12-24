package data_structures.linked_lists;

/*
 * Problem Statement:
 * You’re given the pointer to the head nodes of two linked lists that merge
 * together at some node. Find the node at which this merger happens. The two
 * head nodes will be different and neither will be NULL.
 * 
 * [List #1] a--->b--->c
 * 						\
 * 						x--->y--->z--->NULL
 * 						/
 * 		[List #2] p--->q
 * In the above figure, both list merges at node x.
 * 
 * Input Format:
 * You have to complete the int FindMergeNode(Node* headA, Node* headB) method
 * which takes two arguments - the heads of the linked lists. You should NOT
 * read any input from stdin/console.
 * 
 * Output Format:
 * Find the node at which both lists merge and return the data of that node. Do
 * NOT print anything to stdout/console.
 * 
 * Sample Input: 
 * 1
 * 	\
 * 	 2--->3--->NULL
 * 	/
 * 1
 * 
 * 
 * 1--->2
 * 		 \
 * 		  3--->Null
 * 		 /
 * 		1
 * 
 * Sample Output: 
 * 2
 * 3
 */
public class FindMergePointOfTwoLists {

	int FindMergeNode(Node headA, Node headB) {

	    Node runnerA;
	    Node runnerB = headB;
	    
	    int mergeData = 0;
	    
	    outerloop:
	    while (true) { 
	        runnerA = headA;
	        while (runnerA != null) {
	            if (runnerA.next == runnerB.next) {
	                mergeData = runnerA.next.data;
	                break outerloop;
	            } else {
	                runnerA = runnerA.next;
	            }
	        }
	        runnerB = runnerB.next;
	    }
	    return mergeData;
	}
}