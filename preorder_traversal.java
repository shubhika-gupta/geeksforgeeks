//preorder traversal
class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        pre(root,list);
        return list;
    }
    static void pre(Node root,ArrayList<Integer> list){
        if(root!=null){
            list.add(root.data);
            pre(root.left,list);
            pre(root.right,list);
        }
    }

}