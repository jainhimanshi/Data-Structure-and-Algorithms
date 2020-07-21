package binaryTree;

//Depth of BT = length of path from root to node.
public class DepthOfBinaryTree {
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
	
	System.out.println(FindDepth(root));
	}
	
	public static int  FindDepth(Node root) {
		if(root==null) 	
			return 0;
		else if (root.left==null&&root.right==null)
			return 0;
		else {
			int LEFT=FindDepth(root.left);
			int RIGHT=FindDepth(root.right);
			Depth=1+max(LEFT,RIGHT);
			return Depth;
		}
	}
	public static int max(int n1,int n2) {
		if(n1>n2)
			return n1;
		else
			return n2;
	}

}
