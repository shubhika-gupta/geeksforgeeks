//special height of spiral tree
class Tree
{
    public static boolean isleaf(Node node){
        return (node.left != null && node.left.right == node && 
                    node.right != null && node.right.left == node);
    }
    // Return the height of the given special binary tree
    public static int findTreeHeight(Node root)
        {
            if(root==null)
            return 0;
            if(isleaf(root))
            return 1;
            return 1+Math.max(findTreeHeight(root.left),findTreeHeight(root.right));
        }
}