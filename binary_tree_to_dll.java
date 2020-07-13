//convert binary tree to dll
class GfG
{
    static Node head; 
       
    // Initialize previously visited node as NULL. This is 
    // static so that the same value is accessible in all recursive 
    // calls 
    static Node prev=null;
    Node bToDLL(Node root)
    {
        // Base case 
        if (root == null) 
            return null; 
   
        // Recursively convert left subtree 
        bToDLL(root.left); 
   
        // Now convert this node 
        if (prev == null)  
            head = root; 
        else
        { 
            root.left = prev; 
            prev.right = root; 
        } 
        prev = root; 
   
        // Finally convert right subtree 
        bToDLL(root.right); 
        return head;
    }
}