//print all nodes at k distance
class Tree
{
     // Recursive function to print right view of a binary tree.
     
     void printKdistance(Node node, int k)
     {
          if (node == null || k < 0) 
            return; 
   
        // If we reach a k distant node, print it 
        if (k == 0)  
        { 
            System.out.print(node.data+" ");
            return; 
        } 
   
        // Recur for left and right subtrees 
        printKdistance(node.left, k - 1); 
        printKdistance(node.right, k - 1); 

     }
}