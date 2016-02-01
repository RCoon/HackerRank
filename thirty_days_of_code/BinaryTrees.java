package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * You are given a pointer root pointing to the root of a binary tree. You need
 * to print the level order traversal of this tree. In level order traversal, we
 * visit the nodes level by level from left to right.
 * For example:
 * 
 *       3
 *     /   \
 *    5     2
 *   / \   /
 *  1   4 6
 * For the above tree, the level order traversal is 3 -> 5 -> 2 -> 1 -> 4 -> 6.
 * 
 * Input Format: 
 * First line contains T, the number of test cases. Next T lines contain an
 * integer data to be added to the binary search tree.
 * 
 * Output Format: 
 * Print the values of the level order traversal separated by spaces.
 * 
 * Sample Input: 
 * 6
 * 3
 * 5
 * 4
 * 7
 * 2
 * 1
 * 
 * Sample Output: 
 * 3 2 5 1 4 7
 */
public class BinaryTrees {

	static void levelOrder(TNode root) {
		int h = getHeight(root);
		for (int i = 1; i <= h; i++) {
			printLevel(root, i);
		}
	}

	static void printLevel(TNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			printLevel(root.left, level - 1);
			printLevel(root.right, level - 1);
		}
	}

	static int getHeight(TNode root) {

		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}
	}

	public static TNode insert(TNode root, int data) {
		if (root == null) {
			return new TNode(data);
		} else {
			TNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}
}