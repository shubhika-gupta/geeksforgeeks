//convert into sumtree
class Tree{
    public void toSumTree(Node root){
        int k=sum(root);
    }
    public int sum(Node root){
        if(root==null)
        return 0;
        int val=root.data;
        root.data=sum(root.left)+sum(root.right);
        return root.data+val;
    }
}