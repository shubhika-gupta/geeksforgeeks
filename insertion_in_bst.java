//insertion in bst
class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int Key)
    {
        // your code here
        if(root==null){
            root=new Node(Key);
            return root;
        }
        if(root.data>Key){
            root.left=insert(root.left,Key);
        }
        else if(root.data<Key){
            root.right=insert(root.right,Key);
        }
        return root;
    }
}