//kth largest element
/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        inorder(list,root);
        Collections.sort(list);
        if(K<=list.size()){
            return list.get(list.size()-K);
        }
        else
        return -1;
    }
    void inorder(ArrayList<Integer> list,Node root){
        if(root!=null){
            inorder(list,root.left);
            list.add(root.data);
            inorder(list,root.right);
        }
    }
}