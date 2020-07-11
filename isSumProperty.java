//is sum property
class Tree
{
    // Return 1 if all the nodes in the tree satisfy the given property. Else return 0
    public static int isSumProperty(Node root)
    {
        if(root==null||(root.left==null&&root.right==null))
        return 1;
        else{
            int ld=0,rd=0;
            if(root.left!=null)
            ld=root.left.data;
            if(root.right!=null)
            rd=root.right.data;
            if((root.data==ld+rd)&&isSumProperty(root.left)!=0&&isSumProperty(root.right)!=0)
            return 1;
            else
            return 0;
        }
        
    }
}