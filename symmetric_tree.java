//issymmteric
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return root==null||helper(root.left,root.right);
    }
    public static boolean helper(Node left,Node right){
        if(left==null||right==null)
        return left==right;
        if(left.data!=right.data)
        return false;
        return helper(left.left,right.right)&&helper(right.left,left.right);
    }
}