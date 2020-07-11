//remove half nodes
class Tree
{
    // Return the root of the modified tree after removing all the half nodes.
    public static Node RemoveHalfNodes(Node root)
    {
        if(root==null)
        return null;
        root.left=RemoveHalfNodes(root.left);
        root.right=RemoveHalfNodes(root.right);
        if(root.left==null&&root.right==null)
        return root;
        if(root.left==null)
        {
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        return root;
    }
}