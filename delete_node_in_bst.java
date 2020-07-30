//delete nodefrom bst
class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int key)
	{
	  if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.data) 
            root.left = deleteNode(root.left, key); 
        else if (key > root.data) 
            root.right = deleteNode(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteNode(root.right, root.data); 
        } 
  
        return root; 
    } 
  
    static int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 
}