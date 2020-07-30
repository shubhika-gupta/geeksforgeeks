//check if bst
public class Tree
{
    boolean isbst(Node root,Node l,Node r){
        if(root==null){
            return true;
        }
        if(l!=null&&root.data<=l.data){
            return false;
        }
        if(r!=null&&root.data>=r.data){
            return false;
        }
        return isbst(root.left,l,root)&&isbst(root.right,root,r);
    }
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            if(isbst(root,null,null)){
                return true;
            }
            else{
                return false;
            }
        }
}