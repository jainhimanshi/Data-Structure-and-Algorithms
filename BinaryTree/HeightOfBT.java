package binaryTree;
//Height of tree is number of levels in tree.
//height=Depth +1

public class HeightOfBT {
	
		static Node root;
		
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
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left= new Node(4); 
	    root.left.right= new Node(5); 
		System.out.println(height(root));
		}
		
		
	    public static int  height(Node root) {
			if(root==null) 	
				return 0;
			else {
				int LEFT=height(root.left);
				int RIGHT=height(root.right);
				 /* use the larger one */
	            if (LEFT>RIGHT) 
	                return(LEFT+1); 
	            else return(RIGHT+1);  
	        } 
		}
	}
