package data_structures.trees;

/*
 * Problem Statement:
 * You are given a pointer root pointing to the root of a binary tree. You need
 * to print the level order traversal of this tree. In level order traversal, we
 * visit the nodes level by level from left to right.
 * For example:
 * 
 *      3
 *    /   \
 *   5     2
 *  / \   /
 * 1   4 6
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
 *      3
 *    /   \
 *   5     2
 *  / \   /
 * 1   4 6
 * 
 * Sample Output: 
 * 3 5 2 1 4 6
 */
public class LevelOrderTraversal {

	void LevelOrder(Node root) {
		int h = getHeight(root);
		for (int i = 1; i <= h; i++) {
			printLevel(root, i);
		}
	}

	void printLevel(Node root, int level) {
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

	int getHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}
	}
}