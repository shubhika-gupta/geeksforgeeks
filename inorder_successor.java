//inorder successor
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class Tree
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node n)
         {
             if (n.right != null) 
        return minValue(n.right); 
  
    Node succ = null; 
  
    // Start from root and search for 
    // successor down the tree 
    while (root != null) { 
        if (n.data < root.data) { 
            succ = root; 
            root = root.left; 
        } 
        else if (n.data > root.data) 
            root = root.right; 
        else
            break; 
    } 
  
    return succ; 
    } 
  
    /* Given a non-empty binary search  
       tree, return the minimum data   
       value found in that tree. Note that  
       the entire tree does not need 
       to be searched. */
    Node minValue(Node node) 
    { 
        Node current = node; 
  
        /* loop down to find the leftmost leaf */
        while (current.left != null) { 
            current = current.left; 
        } 
        return current; 
    } 
}