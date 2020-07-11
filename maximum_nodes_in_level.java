//max nodes level
class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        if (root == null)  
        return -1;  
  
    Queue<Node> q = new LinkedList<Node> ();  
    q.add(root);  
  
    // Current level  
    int level = 0;  
  
    // Maximum Nodes at same level  
    int max = Integer.MIN_VALUE;  
  
    // Level having maximum Nodes  
    int level_no = 0;  
  
    while (true)  
    {  
        // Count Nodes in a level  
        int NodeCount = q.size();  
  
        if (NodeCount == 0)  
            break;  
  
        // If it is maximum till now  
        // Update level_no to current level  
        if (NodeCount > max)  
        {  
            max = NodeCount;  
            level_no = level;  
        }  
  
        // Pop complete current level  
        while (NodeCount > 0)  
        {  
            Node Node = q.peek();  
            q.remove();  
            if (Node.left != null)  
                q.add(Node.left);  
            if (Node.right != null)  
                q.add(Node.right);  
            NodeCount--;  
        }  
  
        // Increment for next level  
        level++;  
    }  
  
    return level_no;  
    }
}