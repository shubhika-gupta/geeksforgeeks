//level order traversal o(n)
class Level_Order_Traverse
{
    static void levelOrder(Node root) 
    {
        if(root == null) 
            return; 
          
        // Create an empty queue for level order tarversal 
        Queue<Node> q =new LinkedList<Node>(); 
          
        // Enqueue Root and initialize height 
        q.add(root); 
          
          
        while(true) 
        { 
              
            // nodeCount (queue size) indicates number of nodes 
            // at current level. 
            int nodeCount = q.size(); 
            if(nodeCount == 0) 
                break; 
              
            // Dequeue all nodes of current level and Enqueue all 
            // nodes of next level 
            while(nodeCount > 0) 
            { 
                Node node = q.peek(); 
                System.out.print(node.data + " "); 
                q.remove(); 
                if(node.left != null) 
                    q.add(node.left); 
                if(node.right != null) 
                    q.add(node.right); 
                nodeCount--; 
            } 
            System.out.print("$ "); 
        } 
    }
}