//max level sum 
class GfG {
    public int maxLevelSum(Node root) {
        if (root == null) 
        return 0; 
  
    // Initialize result 
    int result = root.data; 
  
    // Do Level order traversal keeping track of number 
    // of nodes at every level. 
    Queue<Node> q=new LinkedList<>(); 
    q.add(root); 
    while (!q.isEmpty()) 
    { 
        // Get the size of queue when the level order 
        // traversal for one level finishes 
        int count = q.size() ; 
  
        // Iterate for all the nodes in the queue currently 
        int sum = 0; 
        while (count-->0) 
        { 
            // Dequeue an node from queue 
            Node temp = q.peek(); 
            q.remove(); 
  
            // Add this node's value to current sum. 
            sum = sum + temp.data; 
  
            // Enqueue left and right children of 
            // dequeued node 
            if (temp.left != null) 
                q.add(temp.left); 
            if (temp.right != null) 
                q.add(temp.right); 
        } 
  
        // Update the maximum node count value 
        result = Math.max(sum, result); 
    }
    return result;
    }
}