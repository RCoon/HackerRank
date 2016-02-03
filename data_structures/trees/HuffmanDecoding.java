package data_structures.trees;

/*
 * Huffman coding assigns variable length codewords to fixed length input
 * characters based on their frequencies. More frequent characters are assigned
 * shorter codewords and less frequent characters are assigned longer codewords.
 * A huffman tree is made for the input string and characters are decoded based
 * on their position in the tree. We add a '0' to the codeword when we move left
 * in the binary tree and a '1' when we move right in the binary tree. We assign
 * codes to the leaf nodes which represent the input characters.
 * 
 * For example:
 *      {@,5}
 *     0/   \ 1
 *   {@,2} {A,3}
 *  0/   \1
 * {B,1} {C,1}
 * Input characters are only present on the leaves. Internal nodes have a
 * character value of @. Codewords:
 * 
 * A - 1
 * B - 00
 * C - 01
 * No codeword appears as a prefix of any other codeword. Huffman encoding is a
 * prefix free encoding technique.
 * 
 * Encoded String "1001011" represents the string "ABACA"
 * 
 * You have to decode an encoded string using the huffman tree.
 * 
 * You are given pointer to the root of the huffman tree and a binary coded
 * string. You need to print the actual string.
 * 
 * Input Format: 
 * You are given a function,
 * 
 * void decode_huff(node * root, string s) {
 * 
 * }
 * 
 * The structure for node is defined as:
 * struct node {
 *     int freq;
 *     char data;
 *     node * left;
 *     node * right;
 * } node;
 * 
 * Note:
 * Internal nodes have data='\0'(@ )
 * 
 * Output Format: 
 * Output the decoded string on a single line.
 * 
 * Sample Input:
 *      {@,5}
 *     0/   \ 1
 *   {@,2} {A,3}
 *  0/   \1
 * {B,1} {C,1}
 * 
 * S="1001011"
 * 
 * Sample Output: 
 * ABACA
 */
public class HuffmanDecoding {

	void decode(String S, Node root) {
	    
	    StringBuilder sb = new StringBuilder();
	    Node treeNode = root;
	    
	    for (int i = 0; i < S.length(); i++) {
	        treeNode = S.charAt(i) == '1' ? treeNode.right : treeNode.left;
	        if (treeNode.data != '\0') {
	            sb.append(treeNode.data);
	            treeNode = root;
	        }
	    }
	    System.out.print(sb.toString());
	}
}