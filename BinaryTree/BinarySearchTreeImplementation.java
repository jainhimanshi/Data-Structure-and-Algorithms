package binaryTree;

public class BinarySearchTreeImplementation {

	static Node root;
	
	static class Node {
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
	 root=new Node(3);
	insert(root,1);
	insert(root,6);
	insert(root,2);
	 traversal(root);
	}
	
	public static void traversal(Node root) {
		if(root==null)
		return ;
		else {
		System.out.println(root.key);
		traversal(root.left);
		traversal(root.right);}
	}
	
	public static Node insert(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		else {
			if(data<root.key)
				root.left=insert(root.left,data);
			else if (data>root.key)
				root.right=insert(root.right,data);
		}
		return root;		
	}

}
