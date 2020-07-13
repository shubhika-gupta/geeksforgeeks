//boundary traversal
class Solution
{
    ArrayList<Integer> list=new ArrayList<>();
	ArrayList <Integer> printBoundary(Node node)
	{
	   if(node==null)
	    return list;
	    list.add(node.data);
	    pleft(node.left);
	    pleave(node.left);
	    pleave(node.right);
	    pright(node.right);
	    return list;
	   
	}
	   void pleave(Node node){
        if(node==null)
        return;
        pleave(node.left);
        if(node.left==null&&node.right==null)
        list.add(node.data);
        pleave(node.right);
    }
    void pleft(Node node){
        if(node==null)
        return;
        if(node.left!=null)
        {
            list.add(node.data);
            pleft(node.left);
        }
        else if(node.right!=null){
            list.add(node.data);
            pleft(node.right);
        }
    }
    void pright(Node node){
        if(node==null)
        return;
        if(node.right!=null)
        {
            pright(node.right);
            list.add(node.data);
        }
        else if(node.left!=null){
            pright(node.left);
            list.add(node.data);
        }
    }
}