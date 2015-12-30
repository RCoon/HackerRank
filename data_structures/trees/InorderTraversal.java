package data_structures.trees;

/*
 * Problem Statement: 
 * You are given a pointer to the root of a binary tree; print the values in
 * in-order traversal.
 * 
 * You only have to complete the function.
 * 
 * Input Format:
 * You are given a function,
 * 
 * void Inorder(node *root) {
 * 
 * }
 * 
 * Output Format:
 * Print the values on a single line separated by space.
 * 
 * Sample Input: 
 *      3
 *    /   \
 *   5     2
 *  / \   /
 * 1   4 6
 * 
 * Sample Output: 
 * 1 5 4 3 6 2
 */
public class InorderTraversal {

	void Inorder(Node root) {
	    
	    if (root.left != null) {
	        Inorder(root.left);
	    }
	    System.out.print(root.data + " ");
	    if (root.right != null) {
	        Inorder(root.right);
	    }
	}
}