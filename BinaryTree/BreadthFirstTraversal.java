package binaryTree;

public class BreadthFirstTraversal {
	static Node root;
	//static int Depth;
	
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
	printLevelOrder();
	}
	
	public static void BFT(Node root,int level) {
		if(root==null)
			return ;
		if(level==1) 
			System.out.println(root.key);
		else if(level>1){
				BFT(root.left,level-1);
				BFT(root.right,level-1);
		}
	}
	
	/* function to print level order traversal of tree*/
    static void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            BFT(root, i); 
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

