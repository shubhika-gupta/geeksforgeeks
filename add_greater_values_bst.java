//add greater values to bst
class Solution{
    public class Sum { 
        int sum = 0; 
    } 
  
    // Recursive function to add all greater values in 
    // every node 
    void modifyBSTUtil(Node node, Sum S) 
    { 
        // Base Case 
        if (node == null) 
            return; 
  
        // Recur for right subtree 
        this.modifyBSTUtil(node.right, S); 
  
        // Now *sum has sum of nodes in right subtree, add 
        // root->data to sum and update root->data 
        S.sum = S.sum + node.data; 
        node.data = S.sum; 
  
        // Recur for left subtree 
        this.modifyBSTUtil(node.left, S); 
    } 
    // modify the BST and return its root
    public Node modify(Node root)
    {
        //Write your code here
         Sum S = new Sum(); 
        this.modifyBSTUtil(root, S);
        return root;
    }
    
}