//sum of left leaves nodes
class Solution{
    public boolean isleaf(Node root){
        if(root==null)
        return false;
        if(root.left==null&&root.right==null)
        return true;
        return false;
    }

    public int leftLeavesSum(Node root) 
    { 
       int res=0;
       if(root!=null){
           if(isleaf(root.left)){
               res+=root.left.data;
           }
           else
           res+=leftLeavesSum(root.left);
       res+=leftLeavesSum(root.right);
       }
    return res;
    } 

}