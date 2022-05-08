package com.greatleaning.bst.Q2;

	//Class of the node
    	class Node
			{
			 int val;
			 Node left, right;
			 
			 // Helper function that allocates a new node
			 // with the given data and NULL left and right
			 // pointers.
			 Node(int item)
			 {
			     val = item;
			     left = right = null;
			 }
			}
      	class BST
			{
			  Node node;
			  Node prevNode = null;
			  Node headNode = null;
			
			 // Function to to flatten the binary
			 // search tree into a skewed tree in
			 // increasing order
			 void flattenBTToSkewed(Node root)
			 {
			     // Base Case
			     if(root == null)
			     {
			         return;
			     }
			    
			     flattenBTToSkewed(root.left);
			    
			     Node rightNode = root.right;
			     Node leftNode = root.left;
			    
			     // Condition to check if the root Node
			     // of the skewed tree is not defined
			     if(headNode == null)
			     {
			         headNode = root;
			         root.left = null;
			         prevNode = root;
			     }
			     else
			     {
			         prevNode.right = root;
			         root.left = null;
			         prevNode = root;
			     }
			 
			         flattenBTToSkewed(rightNode);
			    
			 }
			
			 // Function to traverse the right
			 // skewed tree using recursion
			  void traverseRightSkewed(Node root)
			 {
			     if(root == null)
			     {
			         return;
			     }
			     System.out.print(root.val + " ");
			     traverseRightSkewed(root.right);       
			 }
		}