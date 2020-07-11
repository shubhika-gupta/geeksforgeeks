//reverse alternate levels
class Tree
{
    static void rev(Node root1,Node root2,int level){
        if(root1==null||root2==null)
        return;
        if(level%2==0){
            int k=root1.data;
            root1.data=root2.data;
            root2.data=k;
        }
        rev(root1.left,root2.right,level+1);
        rev(root1.right,root2.left,level+1);
    }
	static void reverseAlternate( Node root)  
    {  
       if(root==null)
       return;
       rev(root.left,root.right,0);
    }  
}