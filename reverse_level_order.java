//reverse level order traversal
class Tree
{
    int height(Node node){
        if(node==null)
        return 0;
        int l=height(node.left);
        int r=height(node.right);
        return l>r?1+l:1+r;
    }
    public void print(Node node,int lvl){
        if(node==null)
        return;
        if(lvl==1){
        System.out.print(node.data+" ");return;}
        else if(lvl>1){
            print(node.left,lvl-1);
            print(node.right,lvl-1);
        }
    }
	public void reversePrint(Node node) 
        {
            if(node==null)
            return;
            int h=height(node);
            for(int i=h;i>=1;i--){
                print(node,i);
            }
        }
}      