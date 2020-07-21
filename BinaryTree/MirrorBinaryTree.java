package binaryTree;

import binaryTree.DepthOfBinaryTree.Node;

public class MirrorBinaryTree {

	static Node root;
	static int Depth;
	
	static class Node {
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
	root=new Node(3);
	root.left=new Node(1);
	root.right=new Node(7);
	root.left.left=new Node (0);
	traversal(root);
	Mirror(root);
	System.out.println("Mirror tree is ");
	traversal(root);
	}
	
	public static Node Mirror(Node root) {
		if(root==null)
			return null;
		if((root.left)==null&&(root.right==null))
			return root;
		else {
			Node temp=Mirror(root.left);
			root.left=Mirror(root.right);
			root.right=temp;	
		return root;
		}
	}
	
	public static void traversal(Node root) {
		if(root==null)
			return ;
		else {
			System.out.println(root.key);
			traversal(root.left);
			traversal(root.right);
		}
	}

}
