//convert binary tree to bst
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class GfG
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
        Node root_bst=null;
        ArrayList<Integer> list=new ArrayList<>();
        inorder(list,root);
        for(int i=0;i<list.size();i++){
            root_bst=insert(root_bst,list.get(i));
        }
        return root_bst;
    }
    Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.data<key){
            root.right=insert(root.right,key);
        }
        else if(root.data>key){
            root.left=insert(root.left,key);
        }
        return root;
    }
    void inorder(ArrayList<Integer> list,Node root){
        if(root!=null){
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);}
    }
}