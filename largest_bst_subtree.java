class Solution{
    static int size(Node node) 
    { 
        if (node == null) 
            return 0; 
        else
            return(size(node.left) + 1 + size(node.right)); 
    } 
    static boolean isBST(Node root, Node l, Node r)  
{  
    // Base condition  
    if (root == null)  
        return true;  
  
    // if left node exist then check it has  
    // correct data or not i.e. left node's data  
    // should be less than root's data  
    if (l != null && root.data <= l.data)  
        return false;  
  
    // if right node exist then check it has  
    // correct data or not i.e. right node's data  
    // should be greater than root's data  
    if (r != null && root.data >= r.data)  
        return false;  
  
    // check recursively for every node.  
    return isBST(root.left, l, root) &&  
        isBST(root.right, root, r);  
} 
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if(isBST(root,null,null))
        return size(root);
        return Math.max(largestBst(root.left),largestBst(root.right));
        
    }
    
}