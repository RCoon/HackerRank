package data_structures.trees;

/*
 * Problem Statement:
 * The height of a binary tree is the number of nodes on the largest path from
 * root to any leaf. You are given a pointer to the root of a binary tree.
 * Return the height of the tree.
 * You only have to complete the function.
 * 
 * Input Format: 
 * You are given a function,
 * 
 * int height_of_bt(node * root)
 * {
 * 
 * }
 * 
 * Output Format: 
 * Return a single value equal to the height of the binary tree.
 * 
 * Sample Input: 
 *       3
 *      /  \
 *     5    2
 *    / \  /
 *   1  4 6
 *       /
 *      7
 *      
 * Sample Output: 
 * 4
 */
public class HeightOfABinaryTree {

	int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}
}