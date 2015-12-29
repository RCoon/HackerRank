package data_structures.trees;

/*
 * Problem Statement: 
 * You are given a pointer to the root of a binary tree; print the values in
 * post-order traversal.
 * 
 * You only have to complete the function.
 * 
 * Input Format:
 * You are given a function,
 * 
 * void Postorder(node *root) {
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
 * 1 4 5 6 2 3
 */
public class PostorderTraversal {

	void Postorder(Node root) {
	    
	    if (root.left != null) {
	        Postorder(root.left);
	    }
	    if (root.right != null) {
	        Postorder(root.right);
	    }
	    System.out.print(root.data + " ");
	}
}