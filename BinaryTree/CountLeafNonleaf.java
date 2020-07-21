package binaryTree;

import binaryTree.Traversal.Node;

public class CountLeafNonleaf {

		static Node root;
		static int countleaf=0;
		static int countnonleaf=0;
		
		public static class Node{
			int key;
			Node left;
			Node right;
			
			public Node (int key) {
				this.key=key;
				left=null;
				right=null;
			}
		}

		public static void main(String[] args) {
			root=new Node (3);
			root.left=new Node (1);
			root.right=new Node(5);
			root.left.left=new Node(0);
			System.out.println("count of leaf nodes is "+leafnode(root));
			System.out.println("count of non leaf nodes is "+Nonleafnode(root));
		}
		
		public static int leafnode(Node root) {
			//only root ==null i.e empty tree 
			if(root==null) 
				return 0;
			//only root is their
			if(root.left==null&&root.right==null) {
				System.out.println(root.key);	
				return 1;}
			else {
				int leftleafnodes=leafnode(root.left);
				int rightleafnodes=leafnode(root.right);
				countleaf=leftleafnodes+rightleafnodes;
				return countleaf;
			}
	}
		public static int Nonleafnode(Node root) {
			//only root ==null i.e empty tree 
			if(root==null) 
				return 0;
			//only root is their
			if(root.left==null&&root.right==null)
				return 0;
			else {
				int leftnonleafnodes=Nonleafnode(root.left);
				int rightnonleafnodes=Nonleafnode(root.right);
				countnonleaf=leftnonleafnodes+rightnonleafnodes+1;
				return countnonleaf;
			}
		}
}

