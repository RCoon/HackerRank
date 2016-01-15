package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * You are given a class Node in the editor which has one instance pointer next
 * pointing to next node and an integer data to store the data in Node.
 * 
 * You are also given a pointer head pointing to the head node of a linked list
 * and an integer data to add to the list. Create a new node with the given
 * integer. Insert this node at the tail of the linked list and return the head
 * node. The given head pointer may be null, meaning that the initial list is
 * empty.
 * 
 * Code for input/output is already handled in the editor. You have to complete
 * the function insert given in the editor. It takes two arguments: the head
 * node of the linked list and an integer data to be inserted.
 * 
 * Input Format: 
 * First line contains T, the number of testcases. Each test case contains an
 * integer to be inserted at tail of linked list.
 * 
 * Output Format: 
 * Output the data in each node separated by space.
 * 
 * Sample Input: 
 * 4
 * 2
 * 3
 * 4
 * 1
 * 
 * Sample Output: 
 * 2 3 4 1
 */
public class LinkedList {

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return head;
		} else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
			return head;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
}