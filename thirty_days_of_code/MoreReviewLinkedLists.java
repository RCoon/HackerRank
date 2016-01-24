package thirty_days_of_code;

import java.util.*;

/*
 * Problem Statement:
 * You're given the pointer head pointing to the head node of a linked list,
 * where the data in the nodes is in non decreasing order. Delete as few nodes
 * as possible so that the list does not contain any value more than once. The
 * given head pointer may be null indicating that the list is empty. Adjust the
 * next pointers to ensure that the remaining nodes form a single sorted linked
 * list
 * 
 * The code for handling input/output is already given in the editor. You have
 * to complete the function removeDuplicates given in the editor which takes one
 * argument - the head of the linked list .
 * 
 * Input Format: 
 * First line contains T, the number of testcases. Each test case contains an
 * integer data to be inserted at tail of linked list.
 * Note: The input data for each test case is always given in non-decreasing
 * order.
 * 
 * Output Format: 
 * Print the data in each node of linked list separated by a space after the
 * deletion of duplicates as given in problem statement.
 * 
 * Sample Input: 
 * 6
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 * 
 * Sample Output: 
 * 1 2 3 4
 */
public class MoreReviewLinkedLists {

	static Node removeDuplicates(Node head) {

		if (head != null) {
			Set<Integer> set = new HashSet<>();
			Node runner = head;
			set.add(runner.data);

			while (runner.next != null) {
				if (!set.add(runner.next.data)) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
}