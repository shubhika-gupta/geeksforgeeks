//build tree from inorder and preorder
class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
       return build(0,0,inorder.length-1,preorder,inorder);
    }
    public static Node build(int pre,int in,int inend,int[] preorder,int[] inorder){
        if(pre>preorder.length-1||in>inend)
            return null;
        Node root=new Node(preorder[pre]);
        int k=0;
        for(int i=in;i<=inend;i++){
            if(inorder[i]==root.data){
              k=i;  
            }
        }
        root.left=build(pre+1,in,k-1,preorder,inorder);
        root.right=build(pre+k-in+1,k+1,inend,preorder,inorder);
        return root;
    }
}
