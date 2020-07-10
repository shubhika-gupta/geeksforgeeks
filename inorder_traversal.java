//inorder traversal
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    void helper(Node root,ArrayList<Integer> list){
        if(root==null)
        return;
        helper(root.left,list);
        list.add(root.data);
        helper(root.right,list);
    }
}