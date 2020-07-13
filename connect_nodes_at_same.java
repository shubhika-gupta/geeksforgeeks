//connect nodes at same level
class Tree
{
    /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    public static void connect(Node root)
        {
            Queue<Node> q = new LinkedList<Node>();  
        q.add(root); 
       
        // null marker to represent end of current level 
        q.add(null);  
       
        // Do Level order of tree using NULL markers 
        while (!q.isEmpty()) { 
            Node p = q.peek(); 
            q.remove(); 
            if (p != null) { 
       
                // next element in queue represents next  
                // node at current Level  
                p.nextRight = q.peek(); 
       
                // push left and right children of current 
                // node 
                if (p.left != null) 
                    q.add(p.left);  
                if (p.right != null) 
                    q.add(p.right); 
            }  
              
            // if queue is not empty, push NULL to mark  
            // nodes at this level are visited 
            else if (!q.isEmpty())  
                q.add(null);  
        } 
        }
}