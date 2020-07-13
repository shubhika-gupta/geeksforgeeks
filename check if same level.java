//check if same level
class GfG
{
    boolean checkLevelLeafNode(Node root) 
      { 
             if (root == null) 
                 return true; 
  
             // create a queue for level order traversal 
             Queue<Node> q = new LinkedList<>(); 
             q.add(root); 
           
             int result = Integer.MAX_VALUE; 
             int level = 0; 
  
             // traverse until the queue is empty 
             while (q.size() != 0) { 
                    int size = q.size(); 
                    level++; 
  
                    // traverse for complete level 
                    while (size > 0) { 
                         Node temp = q.remove(); 
  
                         // check for left child 
                         if (temp.left != null) { 
                             q.add(temp.left); 
  
                              // if its leaf node 
                              if (temp.left.left == null && temp.left.right == null) { 
                                   
                                  // if it's first leaf node, then update result 
                                  if (result == Integer.MAX_VALUE) 
                                      result = level; 
  
                                  // if it's not first leaf node, then compare   
                                  // the level with level of previous leaf node. 
                                  else if (result != level) 
                                       return false;  
                              } 
                         } 
                           
                          // check for right child  
                          if (temp.right != null) { 
                             q.add(temp.right); 
  
                              // if its leaf node 
                             if (temp.right.left == null && temp.right.right == null) { 
                                   
                                  // if it's first leaf node, then update result 
                                  if (result == Integer.MAX_VALUE) 
                                      result = level; 
  
                                  // if it's not first leaf node, then compare   
                                  // the level with level of previous leaf node. 
                                  else if (result != level) 
                                       return false;  
                              } 
                         } 
                         size--; 
                    } 
  
             } 
             return true; 
      } 
    boolean check(Node root)
    {
        return checkLevelLeafNode(root);
    }
}