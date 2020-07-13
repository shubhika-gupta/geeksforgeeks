//print extreme nodes in alternate order
class Tree{
    public static void printExtremeNode(Node root)
      {
          if (root == null)  
        return;  
  
    // Create a queue and enqueue left and right  
    // children of root  
    Queue<Node> q = new LinkedList<Node>();  
    q.add(root);  
  
    // flag to indicate whether leftmost node or  
    // the rightmost node has to be printed  
    boolean flag = false;  
    while (q.size()>0)  
    {  
        // nodeCount indicates number of nodes  
        // at current level.  
        int nodeCount = q.size();  
        int n = nodeCount;  
  
        // Dequeue all nodes of current level  
        // and Enqueue all nodes of next level  
        while (n-->0)  
        {  
            Node curr = q.peek();  
  
            // Enqueue left child  
            if (curr.left!=null)  
                q.add(curr.left);  
  
            // Enqueue right child  
            if (curr.right!=null)  
                q.add(curr.right);  
  
            // Dequeue node  
            q.remove();  
  
            // if flag is true, print leftmost node  
            if (flag && n == nodeCount - 1)  
                System.out.print( curr.data + " "); 
  
            // if flag is false, print rightmost node  
            if (!flag && n == 0)  
                System.out.print( curr.data + " ");  
        }  
          
        // invert flag for next level  
        flag = !flag;  
    }  
      }
}