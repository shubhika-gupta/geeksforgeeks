//even odd level difference
class Tree
{
	int getLevelDiff(Node node)
	{
	    if (node == null) 
            return 0; 
  
        // Difference for root is root's data - difference for  
        // left subtree - difference for right subtree 
        return node.data - getLevelDiff(node.left) -  
                                              getLevelDiff(node.right); 
	}
}
