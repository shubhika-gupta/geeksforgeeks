//mirror tree
class Tree
{
    Node mirrorutil(Node root){
        if(root==null)
        return null;
        if(root.left==null&&root.right==null)
        return root;
        Node left=mirrorutil(root.left);
        Node right=mirrorutil(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    void mirror(Node node)
    {
        if(node==null)
        return;
        node=mirrorutil(node);
    }
    
}
