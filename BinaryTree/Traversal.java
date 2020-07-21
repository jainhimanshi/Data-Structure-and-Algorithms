package binaryTree;

public class Traversal{
	
	static Node root;
	
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
		System.out.println("Pre order traversal : ");
		preorder(root);
		System.out.println();
		System.out.println("Post order traversal : ");
		postorder(root);
		System.out.println();
		System.out.println("In order traversal : ");
		inorder(root);
	}
	
	public static void preorder(Node root) {
	if(root==null)
		return ;
	System.out.print(root.key+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root==null)
			return ;
		postorder(root.left);    
		postorder(root.right);
			System.out.print(root.key+" ");
			
		}
	
	public static void inorder(Node root) {
		if(root==null)
			return ;
		inorder(root.left);		
		System.out.print(root.key+" ");			
			inorder(root.right);
		}
}
