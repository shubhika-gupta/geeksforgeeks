//min depth of tree
class Tree
{
	int minDepth(Node root)
	{
	    if(root==null)
	    return 0;
	    if (root.left == null && root.right == null) 
            return 1; 
  
        // If left subtree is NULL, recur for right subtree 
        if (root.left == null) 
            return minDepth(root.right) + 1; 
  
        // If right subtree is NULL, recur for left subtree 
        if (root.right == null) 
            return minDepth(root.left) + 1; 
  
        return Math.min(minDepth(root.left), 
                        minDepth(root.right)) + 1;
	}
}