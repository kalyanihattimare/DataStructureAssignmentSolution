package com.greatleaning.bst.Q2;

public class Main {
		
	//Driver Function
	public static void main(String[] args) {
		
        /*			50			10
         * 			/\			  \
         * 		  30  60	=>    30
         * 	      /   /				\	
         * 	     10   55			50	
         * 						      \
         * 							   55
         * 								\
         * 								 60	
         * */				
		
		BST tree = new BST();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);
	    
	     System.out.println("BST Values in ascending order : ");
	  
	     tree.flattenBTToSkewed(tree.node);
	     tree.traverseRightSkewed(tree.headNode);

	}

}
