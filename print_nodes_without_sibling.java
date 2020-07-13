//print all nodes without sibling
class Tree
{
	void printSibling(Node node)
	{
	    int flag=0;
		if (node == null)
		{//System.out.print("-1");
      return; 
		}
    // If this is an internal node, recur for left 
    // and right subtrees 
    if (node.left != null && node.right != null) 
    { 
        printSibling(node.left); 
        printSibling(node.right); 
        if(flag==0)
        System.out.print("-1");
        //return;
    } 
   
    // If left child is NULL and right is not, print right child 
    // and recur for right child 
    else if (node.right != null) 
    { 
        System.out.print(node.right.data + " "); 
        flag=flag+1;
        printSibling(node.right);
        //return;
    } 
   
    // If right child is NULL and left is not, print left child 
    // and recur for left child 
    else if (node.left != null) 
    { 
        System.out.print( node.left.data + " "); 
        flag=flag+1;
        printSibling(node.left); 
        //return;
    }
	}
}