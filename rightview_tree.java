//right view of the tree
class Max_level { 
  
    int max_level; 
}
class Tree{
Max_level max = new Max_level();
    void vv(Node root,int l,Max_level max_level){
        if(root==null)
        return;
        if(max_level.max_level<l){
            System.out.print(root.data+" ");
            max_level.max_level=l;
        }
        vv(root.right,l+1,max_level);
        vv(root.left,l+1,max_level);
    }
    void rightView(Node node) {
        //int max=Integer.MIN_VALUE;
        vv(node,1,max);
    }
}