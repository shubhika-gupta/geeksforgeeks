//sum tree
class Tree
{
	int sum(Node node)  
    { 
        if (node == null) 
            return 0; 
        return sum(node.left) + node.data + sum(node.right); 
    } 
   
    /* returns 1 if sum property holds for the given 
       node and both of its children */
    boolean isSumTree(Node node)  
    { 
        int ls, rs; 
   
        /* If node is NULL or it's a leaf node then 
           return true */
        if ((node == null) || (node.left == null && node.right == null)) 
            return true; 
   
        /* Get sum of nodes in left and right subtrees */
        ls = sum(node.left); 
        rs = sum(node.right); 
   
        /* if the node and both of its children satisfy the 
           property return 1 else 0*/
        if ((node.data == ls + rs) && (isSumTree(node.left)) 
                && (isSumTree(node.right))) 
            return true; 
   
        return false; 
    } 
}