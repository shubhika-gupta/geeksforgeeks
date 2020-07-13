//check if balanced tree
class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
        if(root==null)return true;
        int l=depth(root.left);
        int r=depth(root.right);
        return Math.abs(l-r)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public int depth(Node root){
        if(root==null)return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}

