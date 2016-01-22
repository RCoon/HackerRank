package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * The height of a binary tree is the number of nodes on the largest path from
 * root to any leaf. You are given a pointer root pointing to the root of a
 * binary search tree. Return the height of the tree.
 * You only have to complete the function getHeight given in the editor.
 * 
 * Input Format: 
 * First line contains T, the number of test cases. Next T lines contain an
 * integer data to be added to the binary search tree.
 * 
 * Output Format: 
 * Output the height of the binary search tree.
 * 
 * Sample Input: 
 * 7
 * 3
 * 5
 * 2
 * 1
 * 4
 * 6
 * 7
 * 
 * Sample Output: 
 * 4
 */
public class BinarySearchTrees {

	public static int getHeight(TNode root){
	    
	    if (root == null) {
	        return 0;
	    } else {
	        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	    }
	}
	
    public static TNode insert(TNode root,int data){
        if(root==null){
            return new TNode(data);
        }
        else{
            TNode cur=new TNode(data);
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
        sc.close();
    }
}

class TNode {
    TNode left,right;
    int data;
    TNode(int data){
        this.data=data;
        left=right=null;
    }
}