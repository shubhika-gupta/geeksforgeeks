//left view
class Max_level { 
  
    int max_level; 
}
class Tree
{
    Max_level max=new Max_level();
    void vv(Node root,int lvl,Max_level max_level){
        if(root==null)
        return;
        if(max_level.max_level<lvl){
            System.out.print(root.data+" ");
            max_level.max_level=lvl;
        }
        vv(root.left,lvl+1,max_level);
        vv(root.right,lvl+1,max_level);
    }
    void leftView(Node root)
    {
        vv(root,1,max);
    }
}