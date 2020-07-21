package binaryTree;

import binaryTree.DepthOfBinaryTree.Node;

public class StrictBTorNot {

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
	System.out.println(strictBT(root));
	}
	
	public static boolean strictBT(Node root) {
		//if empty return its BT;
		if(root==null)
			return true;
		//if no children then its BT . 
		else if (root.left==null&&root.right==null)
			return true;
		//see if two children then BT.
		else {
			if(root.left!=null&&root.right!=null)
				return (strictBT(root.left)&&strictBT(root.right));
		}
		return false;
	}

}
