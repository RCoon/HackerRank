package data_structures.trees;

/*
 * You are given a pointer to the root of a binary tree. Print the top view of
 * the binary tree.
 * You only have to complete the function.
 * For example :
 * 
 *       3
 *      / \
 *     5   2
 *    / \ / \
 *   1  4 6  7
 *    \     /
 *     9   8
 * Top View : 1 -> 5 -> 3 -> 2 -> 7
 * 
 * Input Format: 
 * You are given a function,
 * 
 * void top_view(node * root)
 * {
 * 
 * }
 * 
 * Output Format: 
 * Print the values on a single line separated by space.
 * 
 * Sample Input: 
 *       3
 *      / \
 *     5   2
 *    / \ / \
 *   1  4 6  7
 *    \     /
 *     9   8
 *     
 * Sample Output: 
 * 1 5 3 2 7
 */
public class TopView {

	void top_view(Node root) {
	    if (root == null) {
	        return;
	    }
	    
	    if (root.left != null) {
	        printLeftSide(root.left);
	    }
	    
	    System.out.print(root.data + " ");
	    
	    if (root.right != null) {
	        printRightSide(root.right);
	    }
	}

	void printLeftSide(Node node) {
	    if (node.left != null) {
	        printLeftSide(node.left);
	    }
	    System.out.print(node.data + " ");
	}

	void printRightSide(Node node) {
	    System.out.print(node.data + " ");
	    if (node.right != null) {
	        printRightSide(node.right);
	    }
	}
}